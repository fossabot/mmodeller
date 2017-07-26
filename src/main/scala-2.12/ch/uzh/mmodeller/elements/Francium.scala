package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{W, kJ, uOhm}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Length.m
import ch.uzh.utils.units.Temperature.K

object Francium extends Atomic(87, 223.0) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Fr"
  def category = Category.AlkaliMetals
  def group = 1
  def period = 7
  def block = 's'
  def appearance = "metallic"
  def electronConfiguration = "[Rn] 7s1"
  def electronsPerShell = List(2, 8, 18, 32, 18, 8, 1)
  def crystalStructure = "cubic body centered"
  def magneticOrdering = " ?"
  def casNumber = "7440-73-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(1))
  override def electronNegativity = Some(0.7)
  override def ionizationEnergies = Some(Map("1st" -> 380* (kJ/mol)))
  override def electricalResistivity = Some((3 * uOhm*m, None))
  override def thermalConductivity = Some(List((15 * (W/m*K), Some(K(300)), None)))

  override def density = Some(List((1.87 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(300), None))
  override def boilingPoint = Some((K(950), None))
  override def heatOfFusion = Some((2 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((65 * (kJ/mol), None, None))
}
