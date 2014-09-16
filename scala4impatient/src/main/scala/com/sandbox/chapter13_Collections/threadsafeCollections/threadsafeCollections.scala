package com.sandbox.chapter13_Collections.threadsafeCollections

/**
 * Created by jin1 on 2014/9/16.
 */
object threadsafeCollections {
  def main(args : Array[String]){
    val scores = new scala.collection.mutable.HashMap[String, Int] with
      scala.collection.mutable.SynchronizedMap[String, Int]

    // To see what happens if you don't synchronize, try
    // val scores = new scala.collection.mutable.HashMap[String, Int]

    // 100 runnables update the map concurrently. Don't worry--it's safe :-)

    val runnables = for (n <- 1 to 100) yield new Runnable {
      override def run() {
        for (i <- 1 to 100) {
          val k = i.toString
          scores(k) = scores.getOrElse(k, 0) + 1
          // Increment the count for key k
        }
      }
    }


    import java.util.concurrent._

    val pool = Executors.newCachedThreadPool()
    // To see that this is a race condition at work, use
    // val pool = Executors.newSingleThreadExecutor()

    import scala.collection.JavaConversions.asJavaCollection
    import scala.collection.JavaConversions.collectionAsScalaIterable

    val futures: Iterable[Future[_]] = pool.invokeAll(
      runnables.map(Executors.callable(_)))

    for (f <- futures) f.get() // Wait until they are all done
    pool.shutdown()

    // It's safe, but it's not correct. All counts should be the same
    val values = scores.values
    println(scores.size)
    println(values.mkString(","))
  }
}
