package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Length.m
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Cesium extends ChemicalElementBase(55, 132.9054) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Cs"
  def category = Category.AlkaliMetals
  def group = 1
  def period = 6
  def block = 's'
  def appearance = "silvery gold"
  def electronConfiguration = "[Xe] 6s1"
  def electronsPerShell = List(2, 8, 18, 18, 8, 1)
  def crystalStructure = "body centered cubic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-46-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(1))
  override def electronNegativity = Some(0.79)
  override def ionizationEnergies = Some(Map("1st" -> 375.7* (kJ/mol), "2nd" -> 2234.3* (kJ/mol), "3rd" -> 3400* (kJ/mol)))
  override def atomicRadius = Some(pm(260))
  override def atomicRadiusCalc = Some(pm(298))
  override def covalentRadius = Some(pm(225))
  override def electricalResistivity = Some((205 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((35.9 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((97 * (um/m*K), Some(fromCelsius(25)), None))

  override def youngModulus = Some(List((GPa(1.7), None)))
  override def bulkModulus = Some(List((GPa(1.6), None)))
  override def mohsHardness = Some(List((0.2, None)))
  override def brinellHardness = Some(List((MPa(0.14), None)))

  override def density = Some(List((1.93 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (1.843 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(301.59), None))
  override def boilingPoint = Some((K(944), None))
  override def criticalPoint = Some((K(1938), MPa(9.4)))
  override def heatOfFusion = Some((2.09 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((63.9 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((32.210 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
