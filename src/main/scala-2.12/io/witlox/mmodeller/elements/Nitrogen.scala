package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ}
import io.witlox.mmodeller.utils.units.Length.{m, pm}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.L
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{MPa, kPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Nitrogen extends ChemicalElementBase(7, 14.0067) with ChemicalGroup with CrystalStructure with MagneticOrdering {
  def symbol = "N"
  def category = Category.NonMetal
  def group = 15
  def period = 2
  def block = 'p'
  def appearance = "colorless gas"
  def electronConfiguration = "1s2 2s2 2p3"
  def electronsPerShell = List(2, 5)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7727-37-9"
  def phase = MaterialState.Gas

  override def oxidationStates = Some(List(5, 4, 3, 2, 1, -1, -3))
  override def electronNegativity = Some(3.04)
  override def ionizationEnergies = Some(Map("1st" -> 1402.3 * (kJ/mol), "2nd" -> 2856 * (kJ/mol)))
  override def atomicRadius = Some(pm(65))
  override def atomicRadiusCalc = Some(pm(56))
  override def covalentRadius = Some(pm(75))
  override def vanDerWaalsRadius = Some(pm(155))
  override def thermalConductivity = Some(List((25.83 * Math.pow(10,-3) * (W/m*K), Some(K(300)), None)))

  override def speedOfSound = Some(List((353 * (m/s), Some(fromCelsius(27)), Some(MaterialState.Gas), None)))

  override def density = Some(List(( 1.251 * (g/L), Some( kPa(101.325)), Some(fromCelsius(0)), None, None)))
  override def meltingPoint = Some((K(63.153), None))
  override def boilingPoint = Some((K(77.36), None))
  override def triplePoint = Some((K(63.1526), kPa(12.53)))
  override def criticalPoint = Some((K(126.19), MPa(3.3978)))
  override def heatOfFusion = Some((0.72 * (kJ/mol), None, Some("N2")))
  override def heatOfVaporization = Some((5.56 * (kJ/mol), None, Some("N2")))
  override def specificHeatCapacity = Some(List((29.124 * (J/mol*K), Some(fromCelsius(25)), None,Some("N2"))))
}
