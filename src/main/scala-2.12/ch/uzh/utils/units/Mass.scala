package ch.uzh.utils.units

import ch.uzh.utils.Units.kg
import ch.uzh.utils.units.Prefix._

object Mass {

  val g = new kg(1e-3)
  val gram: kg = g
  val Tg = g(tera)
  val Gg = g(giga)
  val Mg = g(mega)
  val kg = g(kilo)
  val mg = g(milli)
  val ug = g(micro)
  val ng = g(nano)
  val pg = g(pico)

  val tonne = kg(1000)
}
