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

object Magnesium extends ChemicalElementBase(12, 24.3050) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Mg"
  def category = Category.AlkalineEarthMetals
  def group = 2
  def period = 3
  def block = 's'
  def appearance = "white"
  def electronConfiguration = "[Ne] 3s2"
  def electronsPerShell = List(2, 8, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7439-95-4"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2, 1))
  override def electronNegativity = Some(1.31)
  override def ionizationEnergies = Some(Map("1st" -> 737.7 * (kJ/mol), "2nd" -> 1450.7 * (kJ/mol), "3rd" -> 7732.7 * (kJ/mol)))
  override def atomicRadius = Some(pm(150))
  override def atomicRadiusCalc = Some(pm(145))
  override def covalentRadius = Some(pm(130))
  override def vanDerWaalsRadius = Some(pm(173))
  override def electricalResistivity = Some((43.9 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((156 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((24.8 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((4940 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(45), None)))
  override def shearModulus = Some(List((GPa(17), None)))
  override def bulkModulus = Some(List((GPa(45), None)))
  override def poissonRatio = Some(List((0.29, None)))
  override def mohsHardness = Some(List((2.5, None)))
  override def brinellHardness = Some(List((MPa(260), None)))

  override def density = Some(List((1.738 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (1.584 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(923), None))
  override def boilingPoint = Some((K(1363), None))
  override def heatOfFusion = Some((8.48 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((128 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 24.869 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
