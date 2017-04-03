package ch.uzh.utils.units

import ch.uzh.utils.Units.m
import ch.uzh.utils.units.Prefix._

object Length {

  val m = new m()
  val meter: m = m
  val Tm = m(tera)
  val Gm = m(giga)
  val Mm = m(mega)
  val km = m(kilo)
  val dm = m(deci)
  val cm = m(centi)
  val mm = m(milli)
  val um = m(micro)
  val nm = m(nano)
  val pm = m(pico)

}
