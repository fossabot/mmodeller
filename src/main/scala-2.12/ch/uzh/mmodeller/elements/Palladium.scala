package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Palladium extends Atomic(46, 106.42) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Pd"
  def category = Category.TransitionMetals
  def group = 10
  def period = 5
  def block = 'd'
  def appearance = "silvery white metallic"
  def electronConfiguration = "[Kr] 4d10"
  def electronsPerShell = List(2, 8, 18, 18, 0)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-05-3"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(0, +1, +2, +4, +6))
  override def electronNegativity = Some(2.20)
  override def ionizationEnergies = Some(Map("1st" -> 804.4* (kJ/mol), "2nd" -> 1870* (kJ/mol), "3rd" -> 3177* (kJ/mol)))
  override def atomicRadius = Some(pm(140))
  override def atomicRadiusCalc = Some(pm(169))
  override def covalentRadius = Some(pm(131))
  override def vanDerWaalsRadius = Some(pm(163))
  override def electricalResistivity = Some((105.4 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((71.8 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((11.8 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3070 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(121), None)))
  override def shearModulus = Some(List((GPa(44), None)))
  override def bulkModulus = Some(List((GPa(180), None)))
  override def poissonRatio = Some(List((0.39, None)))
  override def mohsHardness = Some(List((4.75, None)))
  override def vickersHardness = Some(List((MPa(461), None)))
  override def brinellHardness = Some(List((MPa(37.3), None)))

  override def density = Some(List((12.023 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (10.38 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1828.05), None))
  override def boilingPoint = Some((K(3236), None))
  override def heatOfFusion = Some((16.74 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((362 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.98 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
