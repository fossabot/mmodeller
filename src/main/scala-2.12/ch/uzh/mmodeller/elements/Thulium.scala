package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{pm, um, m}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Thulium extends Atomic(69, 168.93421) with Positional with CrystalStructure with MagneticOrdering  {
def symbol = "Tm"
  def category = Category.Lanthanoids
  def col = 13
  def row = 1
  def block = 'f'
  def appearance = "silvery gray"
  def electronConfiguration = "[Xe] 4f13 6s2"
  def electronsPerShell = List(2, 8, 18, 31, 8, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic at K(300)"
  def casNumber = "7440-30-4"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.25)
  override def ionizationEnergies = Some(Map("1st" -> 596.7 * (kJ/mol), "2nd" -> 1160 * (kJ/mol), "3rd" -> 2285 * (kJ/mol)))
  override def atomicRadius = Some(pm(175))
  override def atomicRadiusCalc = Some(pm(222))
  override def electricalResistivity = Some((676 * nOhm*m, None))
  override def thermalConductivity = Some(List((16.9 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((13.3 * (um/m*K), None, Some("poly"))

  override def youngModulus = Some(List((GPa(74.0), None)))
  override def shearModulus = Some(List((GPa(30.5), None)))
  override def bulkModulus = Some(List((GPa(44.5), None)))
  override def poissonRatio = Some(List((0.213, None)))
  override def vickersHardness = Some(List((MPa(520), None)))
  override def brinellHardness = Some(List((MPa(471), None)))

  override def density = Some(List((9.32 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (8.56 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1818), None))
  override def boilingPoint = Some((K(2223), None))
  override def heatOfFusion = Some((16.84 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((247 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((27.03 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
