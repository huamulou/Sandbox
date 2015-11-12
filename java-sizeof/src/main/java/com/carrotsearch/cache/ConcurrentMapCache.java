package com.carrotsearch.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import com.carrotsearch.sizeof.RamUsageEstimator;

/**
 * Simple {@link org.springframework.cache.Cache} implementation based on the
 * core JDK {@code java.util.concurrent} package.
 *
 * <p>Useful for testing or simple caching scenarios, typically in combination
 * with {@link org.springframework.cache.support.SimpleCacheManager} or
 * dynamically through {@link ConcurrentMapCacheManager}.
 *
 * <p><b>Note:</b> As {@link ConcurrentHashMap} (the default implementation used)
 * does not allow for {@code null} values to be stored, this class will replace
 * them with a predefined internal object. This behavior can be changed through the
 * {@link #ConcurrentMapCache(String, ConcurrentMap, boolean)} constructor.
 */
public class ConcurrentMapCache extends AbstractValueAdaptingCache {

  private final String name;
  
  private final ConcurrentMap<Object, Object> store;

  public long capacity;
  
  private AtomicLong currentAmountLoad = new AtomicLong(0);
  
  /**
   * 0 stand for false
   * 1 stand for true
   * 2 stand for cleared
   * */
  private AtomicInteger isCapable = new AtomicInteger(1);
  
  /** One kilobyte bytes. */
  public static final long ONE_KB = 1024;
  
  /** One megabyte bytes. */
  public static final long ONE_MB = ONE_KB * ONE_KB;
  
  /** One gigabyte bytes.*/
  public static final long ONE_GB = ONE_KB * ONE_MB;

  /**
   * Create a new ConcurrentMapCache with the specified name.
   * @param name the name of the cache
   */
  public ConcurrentMapCache(String name) {
    this(name, new ConcurrentHashMap<Object, Object>(256), true, ONE_MB);
  }

  /**
   * Create a new ConcurrentMapCache with the specified name.
   * @param name the name of the cache
   * @param allowNullValues whether to accept and convert {@code null}
   * values for this cache
   */
  public ConcurrentMapCache(String name, boolean allowNullValues) {
    this(name, new ConcurrentHashMap<Object, Object>(256), allowNullValues, ONE_MB);
  }

  /**
   * Create a new ConcurrentMapCache with the specified name and the
   * given internal {@link ConcurrentMap} to use.
   * @param name the name of the cache
   * @param store the ConcurrentMap to use as an internal store
   * @param allowNullValues whether to allow {@code null} values
   * (adapting them to an internal null holder value)
   */
  public ConcurrentMapCache(String name, ConcurrentMap<Object, Object> store, boolean allowNullValues, long capacity) {
    super(allowNullValues);
    this.name = name;
    this.store = store;
    this.capacity = capacity;
  }


  @Override
  public final String getName() {
    return this.name;
  }

  @Override
  public final ConcurrentMap<Object, Object> getNativeCache() {
    return this.store;
  }

  @Override
  protected Object lookup(Object key) {
    return this.store.get(key);
  }
  

  /**
   * @return the capacity
   */
  public long getCapacity() {
    return capacity;
  }

  /**
   * @param capacity the capacity to set
   */
  public void setCapacity(long capacity) {
    this.capacity = capacity;
  }

  private boolean isOverflow(Object value){
    boolean rv = false;
    long valueSize = RamUsageEstimator.sizeOf(value);
    if( currentAmountLoad.addAndGet(valueSize) > capacity){
      rv = true;
    }
    
    return rv;
  }
  
  @Override
  public void put(Object key, Object value) {
    if(isOverflow(value)){
      throw new IllegalArgumentException("the cache " + name + " is overflow");
    }
    if(isCapable.get() > 0){
      isCapable.compareAndSet(2,1);
      this.store.put(key, toStoreValue(value));
    }
    
//    for(;;){
//      if(isOverflow(value)){
//        if(isCapable.compareAndSet(1, 0) || isCapable.compareAndSet(0, 0)){
//          throw new IllegalArgumentException("the cache " + name + " is overflow");
//        }
//      }else{
//        break;
//      }
//    }
  }

  @Override
  public ValueWrapper putIfAbsent(Object key, Object value) {
    Object existing = null;
    if(isCapable.get() > 0){
      isCapable.compareAndSet(2,1);
      existing = this.store.putIfAbsent(key, toStoreValue(value));
    }
    
    for(;;){
      if(isOverflow(value)){
        if(isCapable.compareAndSet(1, 0) || isCapable.compareAndSet(0, 0)){
          throw new IllegalArgumentException("the cache " + name + " is overflow");
        }
      }else{
        break;
      }
    }
    
    return toValueWrapper(existing);
  }

  @Override
  public void evict(Object key) {
    long valueSize = RamUsageEstimator.sizeOf(store.get(key));
    currentAmountLoad.addAndGet(-1 * valueSize);
    this.store.remove(key);
  }

  @Override
  public void clear() {
    this.store.clear();
    currentAmountLoad = new AtomicLong(0);
    isCapable.set(2);
  }

}
