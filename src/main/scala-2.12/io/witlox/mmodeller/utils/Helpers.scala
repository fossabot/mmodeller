package io.witlox.mmodeller.utils

object Helpers {
  def reduceByKey[K,V](collection: Traversable[(K, V)])(implicit num: Numeric[V]): Map[K, V] = {
    import num._
    collection
      .groupBy(_._1)
      .map { case (_: K, traversable) => traversable.reduce{ (a, b) => (a._1, a._2 + b._2)} }
  }
}
