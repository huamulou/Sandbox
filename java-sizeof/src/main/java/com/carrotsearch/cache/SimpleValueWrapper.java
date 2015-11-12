package com.carrotsearch.cache;

import com.carrotsearch.cache.Cache.ValueWrapper;

/**
 * Straightforward implementation of {@link org.springframework.cache.Cache.ValueWrapper},
 * simply holding the value as given at construction and returning it from {@link #get()}.
 * 
 */
public class SimpleValueWrapper implements ValueWrapper {

  private final Object value;


  /**
   * Create a new SimpleValueWrapper instance for exposing the given value.
   * @param value the value to expose (may be {@code null})
   */
  public SimpleValueWrapper(Object value) {
    this.value = value;
  }


  /**
   * Simply returns the value as given at construction time.
   */
  @Override
  public Object get() {
    return this.value;
  }

}
