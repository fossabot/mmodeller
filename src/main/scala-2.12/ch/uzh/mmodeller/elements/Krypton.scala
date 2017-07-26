package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ}
import ch.uzh.utils.units.Length.{m, pm}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.L
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{MPa, kPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Krypton extends Atomic(36, 83.798) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Kr"
  def category = Category.NobleGases
  def group = 18
  def period = 4
  def block = 'p'
  def appearance = "colorless gas"
  def electronConfiguration = "[Ar] 3d10 4s2 4p6"
  def electronsPerShell = List(2, 8, 18, 8)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7439-90-9"
  def phase = MaterialState.Gas

  override def oxidationStates = Some(List(4, 2))
  override def electronNegativity = Some(3.00)
  override def ionizationEnergies = Some(Map("1st" -> 1350.8 * (kJ/mol), "2nd" -> 2350.4 * (kJ/mol), "3rd" -> 3565 * (kJ/mol)))
  override def atomicRadiusCalc = Some(pm(88))
  override def covalentRadius = Some(pm(110))
  override def vanDerWaalsRadius = Some(pm(202))
  override def thermalConductivity = Some(List((9.43 * Math.pow(10, -3) * (W/m*K), Some(K(300)), None)))

  override def speedOfSound = Some(List((220 * (m/s), Some(fromCelsius(23)), Some(MaterialState.Gas), None), (1120 * (m/s), None, Some(MaterialState.Liquid), None)))

  override def density = Some(List(( 3.749 * (g/L), Some( kPa(101.325)), Some(fromCelsius(0)), None, None)))
  override def meltingPoint = Some((K(115.79), None))
  override def boilingPoint = Some((K(119.93), None))
  override def triplePoint = Some((K(115.775), kPa(73.2)))
  override def criticalPoint = Some((K(209.41), MPa(5.50)))
  override def heatOfFusion = Some((1.64 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((9.08 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((20.786 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}