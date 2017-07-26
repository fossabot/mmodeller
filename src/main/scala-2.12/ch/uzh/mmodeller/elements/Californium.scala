package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Energy.kJ
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Temperature.K
import ch.uzh.utils.units.Volume.cm3

object Californium extends Atomic(98, 251.0) with Positional {
  def symbol = "Cf"
  def category = Category.Actinoids
  def col = 10
  def row = 2
  def block = 'f'
  def appearance = "silvery"
  def electronConfiguration = "[Rn] 5f10 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 28, 8, 2)
  def casNumber = "7440-71-3"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2, 3, 4))
  override def electronNegativity = Some(1.3)
  override def ionizationEnergies = Some(Map("1st" -> 608* (kJ/mol)))
  override def density = Some(List((15.1 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(1173), None))
  override def boilingPoint = Some((K(1743), None))
}
