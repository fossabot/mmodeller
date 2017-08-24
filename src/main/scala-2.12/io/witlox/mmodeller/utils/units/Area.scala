package io.witlox.mmodeller.utils.units

import io.witlox.mmodeller.utils.Units.Area
import io.witlox.mmodeller.utils.units.Length._

object Area extends Spoon {

  val mm2 = mm*mm
  val m2 = m*m
  val km2 = km*km
  val ha = m(100) * m(100)

  override def spoon(text: String): Option[Any] = {
    val bs = extract(text)
    if (bs.isDefined) {
      bs.get._1 match {
        case a: Area => Some(a * bs.get._2)
        case _ => None
      }
    } else {
      None
    }
  }
}
