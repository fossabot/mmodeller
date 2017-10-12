package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ}
import io.witlox.mmodeller.utils.units.Length.{pm, m}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Pressure.GPa
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Phosphorus extends ChemicalElementBase(15, 30.973762) with ChemicalGroup with MagneticOrdering  {
  def symbol = "P"
  def category = Category.NonMetal
  def group = 15
  def period = 3
  def block = 'p'
  def phase = MaterialState.Solid
  def appearance = "waxy white/ red/ black/ colorless/ yellow"
  def electronConfiguration = "[Ne] 3s2 3p3"
  def electronsPerShell = List(2, 8, 5)
  def magneticOrdering = "diamagnetic"
  def casNumber = "7723-14-0"

  override def oxidationStates = Some(List(5, 4, 3, 2, 1, -3))
  override def electronNegativity = Some(2.19)
  override def ionizationEnergies = Some(Map("1st" -> 1011.8 * (kJ/mol), "2nd" -> 1907 * (kJ/mol), "3rd" -> 2914.1 * (kJ/mol)))
  override def atomicRadius = Some(pm(100))
  override def atomicRadiusCalc = Some(pm(98))
  override def covalentRadius = Some(pm(106))
  override def vanDerWaalsRadius = Some(pm(180))
  override def thermalConductivity = Some(List((0.236 * (W/m*K), Some(K(300)), Some("white"))))
  override def bulkModulus = Some(List((GPa(11), None)))

  override def density = Some(List((1.823 * (g/cm3), None, None, Some("white"), Some(MaterialState.Solid)), (2.34 * (g/cm3), None, None, Some("red"), Some(MaterialState.Solid)), (2.69 * (g/cm3), None, None, Some("black"), Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(317.3), None))
  override def boilingPoint = Some((K(550), None))
  override def heatOfFusion = Some((0.66 * (kJ/mol), None, Some("white")))
  override def heatOfVaporization = Some((12.4 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((23.824 * (J/mol*K), Some(fromCelsius(25)), None,Some("white"))))
}
