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

object Argon extends ChemicalElementBase(18, 39.948) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Ar"
  def category = Category.NobleGases
  def group = 18
  def period = 3
  def block = 'p'
  def appearance = "colourless gas; tasteless,odorless"
  def electronConfiguration = "[Ne] 3s2 3p6"
  def electronsPerShell = List(2, 8, 8)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440–37–1"
  def phase = MaterialState.Gas

  override def oxidationStates = Some(List(0))
  override def ionizationEnergies = Some(Map("1st" -> 1520.6 * (kJ/mol), "2nd" -> 2665.8 * (kJ/mol), "3rd" -> 3931 * (kJ/mol)))
  override def atomicRadius = Some(pm(71))
  override def atomicRadiusCalc = Some(pm(71))
  override def covalentRadius = Some(pm(97))
  override def vanDerWaalsRadius = Some(pm(188))
  override def thermalConductivity = Some(List((17.72 * Math.pow(10,-3) * (W/m*K), Some(K(300)), None)))

  override def speedOfSound = Some(List((323 * (m/s), Some(fromCelsius(27)), Some(MaterialState.Gas), None)))

  override def density = Some(List(( 1.784 * (g/L), Some( kPa(101.325)), Some(fromCelsius(0)), None, None)))
  override def meltingPoint = Some((K(83.80), None))
  override def boilingPoint = Some((K(87.30), None))
  override def triplePoint = Some((K(83.8058), kPa(69)))
  override def criticalPoint = Some((K(150.87), MPa(4.898)))
  override def heatOfFusion = Some((1.18 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((6.43 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 20.786 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
