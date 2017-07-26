package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.GPa
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Vanadium extends Atomic(23, 50.9415) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "V"
  def category = Category.TransitionMetals
  def group = 5
  def period = 4
  def block = 'd'
  def appearance = "silver-grey metal"
  def electronConfiguration = "[Ar] 3d3 4s2"
  def electronsPerShell = List(2, 8, 11, 2)
  def crystalStructure = "cubic body centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-62-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(5, 4, 3, 2, 1))
  override def electronNegativity = Some(1.63)
  override def ionizationEnergies = Some(Map("1st" -> 650.9 * (kJ/mol), "2nd" -> 1414 * (kJ/mol), "3rd" -> 2830 * (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def atomicRadiusCalc = Some(pm(171))
  override def covalentRadius = Some(pm(125))
  override def electricalResistivity = Some((197 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((30.7 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((8.4 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((4560 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(128), None)))
  override def shearModulus = Some(List((GPa(47), None)))
  override def bulkModulus = Some(List((GPa(160), None)))
  override def poissonRatio = Some(List((0.37, None)))
  override def mohsHardness = Some(List((6.7, None)))

  override def density = Some(List((6.0 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (5.5 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(2183), None))
  override def boilingPoint = Some((K(3680), None))
  override def heatOfFusion = Some((21.5 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((459 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 24.89 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
