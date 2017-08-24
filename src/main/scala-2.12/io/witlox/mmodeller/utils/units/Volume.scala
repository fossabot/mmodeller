package io.witlox.mmodeller.utils.units

import io.witlox.mmodeller.utils.Units.Volume
import io.witlox.mmodeller.utils.units.Length._

object Volume extends Spoon {

  val cm3 = cm*cm*cm
  val m3 = m*m*m
  val litre = dm*dm*dm
  val L = litre

  override def spoon(text: String): Option[Any] = {
    val bs = extract(text)
    if (bs.isDefined) {
      bs.get._1 match {
        case v: Volume => Some(v * bs.get._2)
        case _ => None
      }
    } else {
      None
    }
  }
}
