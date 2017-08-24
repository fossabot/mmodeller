package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, Ohm}
import io.witlox.mmodeller.utils.units.Length.{pm, m}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa, Pa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Iodine extends ChemicalElementBase(53, 126.90447) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "I"
  def category = Category.Halogens
  def group = 17
  def period = 5
  def block = 'p'
  def appearance = "violet-dark gray, lustrous"
  def electronConfiguration = "[Kr] 4d10 5s2 5p5"
  def electronsPerShell = List(2, 8, 18, 18, 7)
  def crystalStructure = "orthorhombic"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7553-56-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(1, 5, 7))
  override def electronNegativity = Some(2.66)
  override def ionizationEnergies = Some(Map("1st" -> 1008.4* (kJ/mol), "2nd" -> 1845.9* (kJ/mol), "3rd" -> 3180* (kJ/mol)))
  override def atomicRadius = Some(pm(140))
  override def atomicRadiusCalc = Some(pm(115))
  override def covalentRadius = Some(pm(133))
  override def vanDerWaalsRadius = Some(pm(198))
  override def electricalResistivity = Some((1.3* Math.pow(10, 7) * Ohm * m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((0.449 * (W/m*K), Some(K(300)), None)))
  override def bulkModulus = Some(List((GPa(7.7), None)))

  override def density = Some(List((4.933 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(386.85), None))
  override def boilingPoint = Some((K(457.4), None))
  override def triplePoint = Some((K(386.65), Pa(12.1 * Math.pow(10,3))))
  override def criticalPoint = Some((K(819), MPa(11.7)))
  override def heatOfFusion = Some((15.52 * (kJ/mol), None, Some("I2")))
  override def heatOfVaporization = Some((41.57 * (kJ/mol), None, Some("I2")))
  override def specificHeatCapacity = Some(List((54.44 * (J/mol*K), Some(fromCelsius(25)), None,Some("I2"))))
}
