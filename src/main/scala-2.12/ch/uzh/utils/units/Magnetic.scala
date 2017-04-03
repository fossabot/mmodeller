package ch.uzh.utils.units

import ch.uzh.utils.Units.{T, Wb}
import ch.uzh.utils.units.Prefix._

object Magnetic {

  val Wb = new Wb()
  val Weber = Wb
  val TWb = Wb(tera)
  val GWb = Wb(giga)
  val MWb = Wb(mega)
  val kWb = Wb(kilo)
  val mWb = Wb(milli)
  val uWb = Wb(micro)
  val nWb = Wb(nano)
  val pWb = Wb(pico)

  val T = new T()
  val Tesla = T
  val TT = T(tera)
  val GT = T(giga)
  val MT = T(mega)
  val kT = T(kilo)
  val mT = T(milli)
  val uT = T(micro)
  val nT = T(nano)
  val pT = T(pico)

}
