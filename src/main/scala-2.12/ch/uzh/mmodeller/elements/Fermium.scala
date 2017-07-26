package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.kJ
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Temperature.K

object Fermium extends Atomic(100, 257.0) with Positional {
  def symbol = "Fm"
  def category = Category.Actinoids
  def col = 12
  def row = 2
  def block = 'f'
  def appearance = "unknown, probably silvery white or metallic gray"
  def electronConfiguration = "[Rn] 5f12 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 30, 8, 2)
  def casNumber = "7440-72-4"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2, 3))
  override def electronNegativity = Some(1.3)
  override def ionizationEnergies = Some(Map("1st" -> 627* (kJ/mol)))

  override def meltingPoint = Some((K(1800), None))
}
