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

object Aluminum extends ChemicalElementBase(13, 26.9815386) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Al"
  def category = Category.PostTransitionMetals
  def group = 13
  def period = 3
  def block = 'p'
  def appearance = "grey"
  def electronConfiguration = "[Ne] 3s2 3p1"
  def electronsPerShell = List(2, 8, 3)
  def crystalStructure = "face centered cubic, 0.40494 nm"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7429-90-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 2, 1))
  override def electronNegativity = Some(1.61)
  override def ionizationEnergies = Some(Map("1st" -> 577.5 * (kJ/mol), "2nd" -> 1816.7 * (kJ/mol), "3rd" -> 2744.8 * (kJ/mol)))
  override def atomicRadius = Some(pm(125))
  override def atomicRadiusCalc = Some(pm(118))
  override def covalentRadius = Some(pm(118))
  override def electricalResistivity = Some((28.2 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((237 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((23.1 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((5000 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(70), None)))
  override def shearModulus = Some(List((GPa(26), None)))
  override def bulkModulus = Some(List((GPa(76), None)))
  override def poissonRatio = Some(List((0.35, None)))
  override def mohsHardness = Some(List((2.75, None)))
  override def vickersHardness = Some(List((MPa(167), None)))
  override def brinellHardness = Some(List((MPa(245), None)))

  override def density = Some(List((2.70 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (2.375 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(933.47), None))
  override def boilingPoint = Some((K(2792), None))
  override def heatOfFusion = Some((10.71 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((294.0 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 24.200 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
