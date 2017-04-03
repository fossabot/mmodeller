package ch.uzh.utils.units

import ch.uzh.utils.Units.Pa
import ch.uzh.utils.units.Prefix._

object Pressure {

  val Pa = new Pa()
  val Pascal = Pa
  val TPa = Pa(tera)
  val GPa = Pa(giga)
  val MPa = Pa(mega)
  val kPa = Pa(kilo)
  val hPa = Pa(hecto)
  val mPa = Pa(milli)
  val uPa = Pa(micro)
  val nPa = Pa(nano)
  val pPa = Pa(pico)

  val bar = Pa(1e5)
  val mbar = hPa
  val atm = mbar(1013.25)
}
