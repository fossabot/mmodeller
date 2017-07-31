package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.kJ
import ch.uzh.utils.units.Temperature.K
import ch.uzh.utils.units.Chemical.mol

object Mendelevium extends ChemicalElementBase(101, 258.0) with Positional with MagneticOrdering  {
  def symbol = "Md"
  def category = Category.Actinoids
  def col = 13
  def row = 2
  def block = 'f'
  def appearance = "unknown, probably silvery white or metallic gray"
  def electronConfiguration = "[Rn] 5f13 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 31, 8, 2)
  def magneticOrdering = "no data"
  def casNumber = "7440-11-1"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2, 3))
  override def electronNegativity = Some(1.3)
  override def ionizationEnergies = Some(Map("1st" -> 635* (kJ/mol)))
  override def meltingPoint = Some((K(1100), None))
}
