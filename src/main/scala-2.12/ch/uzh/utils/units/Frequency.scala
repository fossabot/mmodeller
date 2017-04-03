package ch.uzh.utils.units

import ch.uzh.utils.Units.Hz
import ch.uzh.utils.units.Prefix._

object Frequency {

  val Hz = new Hz()
  val Hertz = Hz
  val THz = Hz(tera)
  val GHz = Hz(giga)
  val MHz = Hz(mega)
  val kHz = Hz(kilo)
  val mHz = Hz(milli)
  val uHz = Hz(micro)
  val nHz = Hz(nano)
  val pHz = Hz(pico)

}
