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

object Oxygen extends ChemicalElementBase(8, 15.9994) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "O"
  def category = Category.NonMetal
  def group = 16
  def period = 2
  def block = 'p'
  def appearance = "Liquid Oxygen"
  def electronConfiguration = "1s2 2s2 2p4"
  def electronsPerShell = List(2, 6)
  def crystalStructure = "cubic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7782-44-7"
  def phase = MaterialState.Gas

  override def oxidationStates = Some(List(2, 1, -1, -2))
  override def electronNegativity = Some(3.44)
  override def ionizationEnergies = Some(Map("1st" -> 1313.9 * (kJ/mol), "2nd" -> 3388.3 * (kJ/mol), "3rd" -> 5300.5 * (kJ/mol)))
  override def atomicRadius = Some(pm(60))
  override def atomicRadiusCalc = Some(pm(48))
  override def covalentRadius = Some(pm(73))
  override def vanDerWaalsRadius = Some(pm(152))
  override def thermalConductivity = Some(List((26.58 * Math.pow(10,-3) * (W/m*K), Some(K(300)), None)))

  override def speedOfSound = Some(List((330 * (m/s), Some(fromCelsius(27)), Some(MaterialState.Gas), None)))

  override def density = Some(List(( 1.429 * (g/L), Some( kPa(101.325)), Some(fromCelsius(0)), None, None)))
  override def meltingPoint = Some((K(54.36), None))
  override def boilingPoint = Some((K(90.20), None))
  override def criticalPoint = Some((K(154.59), MPa(5.043)))
  override def heatOfFusion = Some((0.444 * (kJ/mol), None, Some("O2")))
  override def heatOfVaporization = Some((6.82 * (kJ/mol), None, Some("O2")))
  override def specificHeatCapacity = Some(List((29.378 * (J/mol*K), Some(fromCelsius(25)), None,Some("O2"))))
}
