package ch.uzh.utils.units

import ch.uzh.utils.Units.{Bq, Gy, Sv}
import ch.uzh.utils.units.Prefix._

object Radiation {

  val Gy = new Gy()
  val Gray = Gy
  val TGy = Gy(tera)
  val GGy = Gy(giga)
  val MGy = Gy(mega)
  val kGy = Gy(kilo)
  val mGy = Gy(milli)
  val uGy = Gy(micro)
  val nGy = Gy(nano)
  val pGy = Gy(pico)

  val Sv = new Sv()
  val Sievert = Sv
  val TSv = Sv(tera)
  val GSv = Sv(giga)
  val MSv = Sv(mega)
  val kSv = Sv(kilo)
  val mSv = Sv(milli)
  val uSv = Sv(micro)
  val nSv = Sv(nano)
  val pSv = Sv(pico)

  val Bq = new Bq()
  val Bequerel = Bq
  val TBq = Bq(tera)
  val GBq = Bq(giga)
  val MBq = Bq(mega)
  val kBq = Bq(kilo)
  val mBq = Bq(milli)
  val uBq = Bq(micro)
  val nBq = Bq(nano)
  val pBq = Bq(pico)

}
