package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, nOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Lithium extends ChemicalElementBase(3, 6.941) with ChemicalGroup with CrystalStructure with MagneticOrdering {
  def symbol = "Li"
  def category = Category.AlkaliMetals
  def group = 1
  def period = 2
  def block = 's'
  def appearance = "silvery white"
  def electronConfiguration = "1s2 2s1"
  def electronsPerShell = List(2, 1)
  def crystalStructure = "body centered cubic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7439-93-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(1))
  override def electronNegativity = Some(0.98)
  override def ionizationEnergies = Some(Map("1st" -> 520.2 * (kJ/mol), "2nd" -> 7298.1 * (kJ/mol), "3rd" -> 11815.0 * (kJ/mol)))
  override def atomicRadius = Some(pm(145))
  override def atomicRadiusCalc = Some(pm(167))
  override def covalentRadius = Some(pm(134))
  override def vanDerWaalsRadius = Some(pm(182))
  override def electricalResistivity = Some((92.8 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((84.8 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((46 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((6000 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(4.9), None)))
  override def shearModulus = Some(List((GPa(4.2), None)))
  override def bulkModulus = Some(List((GPa(11), None)))
  override def mohsHardness = Some(List((0.6, None)))

  override def density = Some(List((0.534 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (0.512 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(453.69), None))
  override def boilingPoint = Some((K(1615), None))
  override def criticalPoint = Some((  K(3223), MPa(67)))
  override def heatOfFusion = Some((3.00 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((147.1 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 24.860 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
