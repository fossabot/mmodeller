package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ}
import ch.uzh.utils.units.Length.{pm, m}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.L
import ch.uzh.utils.units.Pressure.{MPa, kPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Helium extends Atomic(2, 4.002602) with ChemicalGroup with CrystalStructure with MagneticOrdering {
  def symbol = "He"
  def category = Category.NobleGases
  def group = 18
  def period = 1
  def block = 's'
  def appearance = "colorless"
  def electronConfiguration = "1s2"
  def electronsPerShell = List(2)
  def crystalStructure = "hexagonal close-packed"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-59-7"
  def phase = MaterialState.Gas

  override def ionizationEnergies = Some(Map("1st" -> 2372.3 * (kJ/mol), "2nd" -> 5250.5 * (kJ/mol)))
  override def atomicRadiusCalc = Some(pm(31))
  override def covalentRadius = Some(pm(32))
  override def vanDerWaalsRadius = Some(pm(140))
  override def thermalConductivity = Some(List((0.1513  * (W/m*K), Some(K(300)), None)))

  override def density = Some(List((0.1786 * (g/L), Some(kPa(101.325)), Some(fromCelsius(0)), None, None)))
  override def meltingPoint = Some((K(0.95), None))
  override def boilingPoint = Some((K(4.22), None))
  override def criticalPoint = Some((K(5.19), MPa(0.227)))
  override def heatOfFusion = Some((0.0138 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((0.0829 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 20.786 * (J/mol*K), Some(fromCelsius(25)), None, None)))
}
