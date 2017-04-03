package ch.uzh.utils.units

import ch.uzh.utils.Units.{One, rad}
import ch.uzh.utils.units.Prefix._

import scala.math.Pi

object Angle {

  val rad = new rad()
  val radian: rad = rad
  val Trad = rad(tera)
  val Grad = rad(giga)
  val Mrad = rad(mega)
  val krad = rad(kilo)
  val mrad = rad(milli)
  val urad = rad(micro)
  val nrad = rad(nano)
  val prad = rad(pico)

  val unitlessOne = new One()

  val Tau: Double = 2*Pi
  val turns = new rad(Tau)
  val deg = new rad(Tau/360.0)

}
