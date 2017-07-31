package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{W, kJ, uOhm}
import ch.uzh.utils.units.Length.{pm, m}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Radium extends ChemicalElementBase(88, 226.0) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Ra"
  def category = Category.AlkalineEarthMetals
  def group = 2
  def period = 7
  def block = 's'
  def appearance = "silvery white metallic"
  def electronConfiguration = "[Rn] 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 18, 8, 2)
  def crystalStructure = "cubic body centered"
  def magneticOrdering = "nonmagnetic"
  def casNumber = "7440-14-4"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2))
  override def electronNegativity = Some(0.9)
  override def ionizationEnergies = Some(Map("1st" -> 509.3* (kJ/mol), "2nd" -> 979.0* (kJ/mol)))
  override def atomicRadius = Some(pm(215))
  override def electricalResistivity = Some((1 * uOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((18.6 * (W/m*K), Some(K(300)), None)))

  override def density = Some(List((5.5 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(973), None))
  override def boilingPoint = Some((K(2010), None))
  override def heatOfFusion = Some((8.5 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((113 * (kJ/mol), None, None))
}
