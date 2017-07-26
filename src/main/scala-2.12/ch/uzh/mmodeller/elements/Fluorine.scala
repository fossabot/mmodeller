package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, kJ, mW}
import ch.uzh.utils.units.Length.pm
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.L
import ch.uzh.utils.units.Length.m
import ch.uzh.utils.units.Pressure.{MPa, kPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Fluorine extends Atomic(9, 18.9984032) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "F"
  def category = Category.Halogens
  def group = 17
  def period = 2
  def block = 'p'
  def appearance = "Yellowish brown gas"
  def electronConfiguration = "1s2 2s2 2p5"
  def electronsPerShell = List(2, 7)
  def crystalStructure = "cubic"
  def magneticOrdering = "nonmagnetic"
  def casNumber = "7782-41-4"
  def phase = MaterialState.Gas

  override def oxidationStates = Some(List(-1))
  override def electronNegativity = Some(3.98)
  override def ionizationEnergies = Some(Map("1st" -> 1681.0 * (kJ/mol), "2nd" -> 3374.2 * (kJ/mol), "3rd" -> 6050.4 * (kJ/mol)))
  override def atomicRadius = Some(pm(50))
  override def atomicRadiusCalc = Some(pm(42))
  override def covalentRadius = Some(pm(71))
  override def vanDerWaalsRadius = Some(pm(147))
  override def thermalConductivity = Some(List((27.7 * mW/m*K, Some(K(300)), None)))

  override def density = Some(List(( 1.7 * (g/L), Some( kPa(101.325)), Some(fromCelsius(0)), None, None)))
  override def meltingPoint = Some((K(53.53), None))
  override def boilingPoint = Some((K(85.03), None))
  override def criticalPoint = Some((K(144.13), MPa(5.172)))
  override def heatOfFusion = Some((0.510 * (kJ/mol), None, Some("F2")))
  override def heatOfVaporization = Some((6.62 * (kJ/mol), None, Some("F2")))
  override def specificHeatCapacity = Some(List((31.304 * (J/mol*K), Some(fromCelsius(25)), None,Some("F2"))))
}
