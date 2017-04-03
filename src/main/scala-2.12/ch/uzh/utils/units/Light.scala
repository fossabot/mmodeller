package ch.uzh.utils.units

import ch.uzh.utils.Units.{cd, lm, lx}
import ch.uzh.utils.units.Prefix._

object Light {

  val lm = new lm()
  val lumen: lm = lm
  val Tlm = lm(tera)
  val Glm = lm(giga)
  val Mlm = lm(mega)
  val klm = lm(kilo)
  val mlm = lm(milli)
  val ulm = lm(micro)
  val nlm = lm(nano)
  val plm = lm(pico)

  val lx = new lx()
  val lux: lx = lx
  val Tlx = lux(tera)
  val Glx = lux(giga)
  val Mlx = lux(mega)
  val klx = lux(kilo)
  val mlx = lux(milli)
  val ulx = lux(micro)
  val nlx = lux(nano)
  val plx = lux(pico)

  val cd = new cd()
  val candela: cd = cd
  val Tcd = cd(tera)
  val Gcd = cd(giga)
  val Mcd = cd(mega)
  val kcd = cd(kilo)
  val mcd = cd(milli)
  val ucd = cd(micro)
  val ncd = cd(nano)
  val pcd = cd(pico)

}
