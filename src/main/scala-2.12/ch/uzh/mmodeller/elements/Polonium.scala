package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, uOhm}
import ch.uzh.utils.units.Length.{pm, um, m}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Polonium extends Atomic(84, 209.0) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Po"
  def category = Category.Metalloids
  def group = 16
  def period = 6
  def block = 'p'
  def appearance = "silvery"
  def electronConfiguration = "[Xe] 6s2 4f14 5d10 6p4"
  def electronsPerShell = List(2, 8, 18, 32, 18, 6)
  def crystalStructure = "cubic"
  def magneticOrdering = "nonmagnetic"
  def casNumber = "7440-08-6"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4, 2))
  override def electronNegativity = Some(2.0)
  override def ionizationEnergies = Some(Map("1st" -> 812.1* (kJ/mol)))
  override def atomicRadius = Some(pm(190))
  override def atomicRadiusCalc = Some(pm(135))
  override def electricalResistivity = Some((0.40 * uOhm*m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((20 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((23.5 * (um/m*K), Some(fromCelsius(25)), None))

  override def density = Some(List((9.196 * (g/cm3), None, None, Some("alpha"), Some(MaterialState.Solid)), (9.398 * (g/cm3), None, None, Some("beta"), Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(527), None))
  override def boilingPoint = Some((K(1235), None))
  override def heatOfFusion = Some((13 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((102.91 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.4 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
