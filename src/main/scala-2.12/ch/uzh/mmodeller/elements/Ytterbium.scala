package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, uOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Ytterbium extends ChemicalElementBase(70, 173.054) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Yb"
  def category = Category.Lanthanoids
  def col = 14
  def row = 1
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 4f14 6s2"
  def electronsPerShell = List(2, 8, 18, 32, 8, 2)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-64-4"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2,3))
  override def electronNegativity = Some(1.1)
  override def ionizationEnergies = Some(Map("1st" -> 603.4 * (kJ/mol), "2nd" -> 1174.8 * (kJ/mol), "3rd" -> 2417 * (kJ/mol)))
  override def atomicRadius = Some(pm(175))
  override def atomicRadiusCalc = Some(pm(222))
  override def electricalResistivity = Some((0.250 * uOhm*m, None))
  override def thermalConductivity = Some(List((38.5 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((26.3 * (um/m*K), None, Some("β")))

  override def speedOfSound = Some(List((1590 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(23.9), Some("β"))))
  override def shearModulus = Some(List((GPa(9.9), Some("β"))))
  override def bulkModulus = Some(List((GPa(30.5), Some("β"))))
  override def poissonRatio = Some(List((0.207, Some("β"))))
  override def vickersHardness = Some(List((MPa(206), None)))
  override def brinellHardness = Some(List((MPa(343), None)))

  override def density = Some(List((6.90 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (6.21 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1097), None))
  override def boilingPoint = Some((K(1469), None))
  override def heatOfFusion = Some((7.66 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((159 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.74 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
