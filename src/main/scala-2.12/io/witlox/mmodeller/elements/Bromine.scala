package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, Ohm}
import io.witlox.mmodeller.utils.units.Length.{m, pm}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.MPa
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Bromine extends ChemicalElementBase(35, 79.904) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Br"
  def category = Category.Halogens
  def group = 17
  def period = 4
  def block = 'p'
  def appearance = "gas/liquid: red-brown, solid: metallic luster"
  def electronConfiguration = "[Ar] 4s2 3d10 4p5"
  def electronsPerShell = List(2, 8, 18, 7)
  def crystalStructure = "orthorhombic"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7726-95-6"
  def phase = MaterialState.Liquid

  override def oxidationStates = Some(List(5, 4, 3, 1, -1))
  override def electronNegativity = Some(2.96)
  override def ionizationEnergies = Some(Map("1st" -> 1139.9 * (kJ/mol), "2nd" -> 2103 * (kJ/mol), "3rd" -> 3470 * (kJ/mol)))
  override def atomicRadius = Some(pm(115))
  override def atomicRadiusCalc = Some(pm(94))
  override def covalentRadius = Some(pm(114))
  override def vanDerWaalsRadius = Some(pm(185))
  override def electricalResistivity = Some((7.8 * Math.pow(10, 10) * Ohm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((0.122 * (W/m*K), Some(K(300)), None)))
  override def speedOfSound = Some(List((206 * (m/s), Some(fromCelsius(20)), None, None)))

  override def density = Some(List((3.1028 * (g/cm3), None, None, Some("Br2"), Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(265.8), None))
  override def boilingPoint = Some((K(332.0), None))
  override def criticalPoint = Some((K(588), MPa(10.34)))
  override def heatOfFusion = Some((10.571 * (kJ/mol), None, Some("Br2")))
  override def heatOfVaporization = Some((29.96 * (kJ/mol), None, Some("Br2")))
  override def specificHeatCapacity = Some(List((75.69 * (J/mol*K), Some(fromCelsius(25)), None,Some("Br2"))))
}
