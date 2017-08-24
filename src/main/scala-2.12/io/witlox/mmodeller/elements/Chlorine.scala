package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, Ohm}
import io.witlox.mmodeller.utils.units.Length.{m, pm}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.L
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{MPa, kPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Chlorine extends ChemicalElementBase(17, 35.453) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Cl"
  def category = Category.Halogens
  def group = 17
  def period = 3
  def block = 'p'
  def appearance = "pale green gas"
  def electronConfiguration = "[Ne] 3s2 3p5"
  def electronsPerShell = List(2, 8, 7)
  def crystalStructure = "orthorhombic"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7782-50-5"
  def phase = MaterialState.Gas

  override def oxidationStates = Some(List(-1, +1, +3, +5, +7))
  override def electronNegativity = Some(3.16)
  override def ionizationEnergies = Some(Map("1st" -> 1251.2 * (kJ/mol), "2nd" -> 2298 * (kJ/mol), "3rd" -> 3822 * (kJ/mol)))
  override def atomicRadius = Some(pm(100))
  override def atomicRadiusCalc = Some(pm(79))
  override def covalentRadius = Some(pm(99))
  override def vanDerWaalsRadius = Some(pm(175))
  override def electricalResistivity = Some((10 * Ohm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((8.9 * Math.pow(10,-3) * (W/m*K), Some(K(300)), None)))

  override def speedOfSound = Some(List((206 * (m/s), Some(fromCelsius(0)), Some(MaterialState.Gas), None)))

  override def density = Some(List(( 3.2 * (g/L), Some( kPa(101.325)), Some(fromCelsius(0)), None, None)))
  override def meltingPoint = Some((K(171.6), None))
  override def boilingPoint = Some((K(239.11), None))
  override def criticalPoint = Some((K(416.9), MPa(7.991)))
  override def heatOfFusion = Some((6.406 * (kJ/mol), None, Some("Cl2")))
  override def heatOfVaporization = Some((20.41 * (kJ/mol), None, Some("Cl2")))
  override def specificHeatCapacity = Some(List((33.949 * (J/mol*K), Some(fromCelsius(25)), None,Some("Cl2"))))
}
