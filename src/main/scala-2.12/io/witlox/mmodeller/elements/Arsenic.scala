package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, nOhm}
import io.witlox.mmodeller.utils.units.Length.{pm, m}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Arsenic extends ChemicalElementBase(33, 74.92160) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "As"
  def category = Category.Metalloids
  def group = 15
  def period = 4
  def block = 'p'
  def appearance = "metallic grey"
  def electronConfiguration = "[Ar] 4s2 3d10 4p3"
  def electronsPerShell = List(2, 8, 18, 5)
  def crystalStructure = "rhombohedral"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-38-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(5, 3, 1, -3))
  override def electronNegativity = Some(2.18)
  override def ionizationEnergies = Some(Map("1st" -> 947.0 * (kJ/mol), "2nd" -> 1798 * (kJ/mol), "3rd" -> 2735 * (kJ/mol)))
  override def atomicRadius = Some(pm(115))
  override def atomicRadiusCalc = Some(pm(114))
  override def covalentRadius = Some(pm(119))
  override def vanDerWaalsRadius = Some(pm(185))
  override def electricalResistivity = Some((333 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((50.2 * (W/m*K), Some(K(300)), None)))

  override def youngModulus = Some(List((GPa(8), None)))
  override def bulkModulus = Some(List((GPa(22), None)))
  override def mohsHardness = Some(List((3.5, None)))
  override def brinellHardness = Some(List((MPa(1440), None)))

  override def density = Some(List((5.727 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (5.22 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1090), None))
  override def boilingPoint = Some((K(887), None))
  override def criticalPoint = Some((K(1673), MPa(1)))
  override def heatOfFusion = Some((24.44 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((34.76 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 24.64 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
