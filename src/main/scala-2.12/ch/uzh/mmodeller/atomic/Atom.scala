package ch.uzh.mmodeller.atomic

import ch.uzh.utils.Units.Ar

abstract class Atom(number: Int, atomicWeight: Ar) extends PhysicalProperties with AtomicProperties {

  def protons: Int = number
  def neutrons: Int = atomicWeight.toInt - number
  def electrons: Int = number

}