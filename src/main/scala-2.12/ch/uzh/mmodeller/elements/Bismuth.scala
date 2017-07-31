package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, Ohm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Bismuth extends ChemicalElementBase(83, 208.98040) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Bi"
  def category = Category.PostTransitionMetals
  def group = 15
  def period = 6
  def block = 'p'
  def appearance = "lustrous silver, pink tinge"
  def electronConfiguration = "[Xe] 4f14 5d10 6s2 6p3"
  def electronsPerShell = List(2, 8, 18, 32, 18, 5)
  def crystalStructure = "rhombohedral"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-69-9"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 5))
  override def electronNegativity = Some(2.02)
  override def ionizationEnergies = Some(Map("1st" -> 703 * (kJ/mol), "2nd" -> 1610 * (kJ/mol), "3rd" -> 2466 * (kJ/mol)))
  override def atomicRadius = Some(pm(160))
  override def atomicRadiusCalc = Some(pm(143))
  override def covalentRadius = Some(pm(146))
  override def electricalResistivity = Some((1.29 * Math.pow(10,-6) * Ohm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((7.97 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((13.4 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((1790 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(32), None)))
  override def shearModulus = Some(List((GPa(12), None)))
  override def bulkModulus = Some(List((GPa(31), None)))
  override def poissonRatio = Some(List((0.33, None)))
  override def mohsHardness = Some(List((2.25, None)))
  override def brinellHardness = Some(List((MPa(94.2), None)))

  override def density = Some(List((9.78 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (10.05 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(544.7), None))
  override def boilingPoint = Some((K(1837), None))
  override def heatOfFusion = Some((11.30 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((151 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 25.52 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
