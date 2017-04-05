package ch.uzh.utils.units

import ch.uzh.utils.Units.Area
import ch.uzh.utils.units.Length._

object Area extends Spoon {

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
