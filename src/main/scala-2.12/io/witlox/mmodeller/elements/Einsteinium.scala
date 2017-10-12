package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Energy.kJ
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Temperature.K
import io.witlox.mmodeller.utils.units.Volume.cm3

object Einsteinium extends ChemicalElementBase(99, 252.0) with Positional with MagneticOrdering  {
  def symbol = "Es"
  def category = Category.Actinoids
  def col = 11
  def row = 2
  def block = 'f'
  def appearance = "silver-coloured[1]"
  def electronConfiguration = "[Rn] 5f11 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 29, 8, 2)
  def magneticOrdering = "no data"
  def casNumber = "7429-92-7"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2, 3, 4))
  override def electronNegativity = Some(1.3)
  override def ionizationEnergies = Some(Map("1st" -> 619* (kJ/mol)))

  override def density = Some(List((8.84 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(1133), None))
}
