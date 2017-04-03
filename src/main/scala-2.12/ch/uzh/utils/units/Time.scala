package ch.uzh.utils.units

import ch.uzh.utils.Units.s
import ch.uzh.utils.units.Prefix._

object Time {

  val s = new s()
  val second: s = s
  val Ts = s(tera)
  val Gs = s(giga)
  val Ms = s(mega)
  val ks = s(kilo)
  val ms = s(milli)
  val us = s(micro)
  val ns = s(nano)
  val ps = s(pico)

  val s2 = s*s
  val s3 = s*s*s

  val min = 60*s
  val h = min(60)
  val day = h(24)
  val year = day(365.25)
}
