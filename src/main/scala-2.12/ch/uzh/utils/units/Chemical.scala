package ch.uzh.utils.units

import ch.uzh.utils.Units.{Ar, kat, mol}
import ch.uzh.utils.units.Prefix._

object Chemical {

  val mol  = new mol()
  val Tmol= mol(tera)
  val Gmol = mol(giga)
  val Mmol = mol(mega)
  val kmol = mol(kilo)
  val mmol = mol(milli)
  val umol = mol(micro)
  val nmol = mol(nano)
  val pmol = mol(pico)

  val kat = new kat()
  val Tkat = kat(tera)
  val Gkat = kat(giga)
  val Mkat = kat(mega)
  val kkat = kat(kilo)
  val mkat = kat(milli)
  val ukat = kat(micro)
  val nkat = kat(nano)
  val pkat= kat(pico)

}
