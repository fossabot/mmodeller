package ch.uzh.utils.units

import ch.uzh.utils.Units.{K, Temperature}
import ch.uzh.utils.units.Prefix._

object Temperature {

  val K = new K()
  val Kelvin = K
  val TK = K(tera)
  val GK = K(giga)
  val MK = K(mega)
  val kK = K(kilo)
  val mK = K(milli)
  val uK = K(micro)
  val nK = K(nano)
  val pK = K(pico)

  private val zeroCelsiusInKelvin = 273.15

  val zeroCelsius = new Temperature(zeroCelsiusInKelvin)

  def fromCelsius(value: Double): Temperature = new Temperature(value + zeroCelsiusInKelvin)
  def toCelsius(temperature: Temperature): Double = temperature.value - zeroCelsiusInKelvin
}
