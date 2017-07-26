package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ}
import ch.uzh.utils.units.Length.{m, pm}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.L
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa, kPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Neon extends Atomic(10, 20.1797) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Ne"
  def category = Category.NobleGases
  def group = 18
  def period = 2
  def block = 'p'
  def appearance = "colorless"
  def electronConfiguration = "1s2 2s2 2p6"
  def electronsPerShell = List(2, 8)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-01-9"
  def phase = MaterialState.Gas

  override def ionizationEnergies = Some(Map("1st" -> 2080.7 * (kJ/mol), "2nd" -> 3952.3 * (kJ/mol), "3rd" -> 6122 * (kJ/mol)))
  override def atomicRadiusCalc = Some(pm(38))
  override def covalentRadius = Some(pm(69))
  override def vanDerWaalsRadius = Some(pm(154))
  override def thermalConductivity = Some(List((49.1 * Math.pow(10,-3)  * (W/m*K), Some(K(300)), None)))
  override def speedOfSound = Some(List((435 * (m/s), Some(fromCelsius(0)), Some(MaterialState.Gas), None)))
  override def bulkModulus = Some(List((GPa(654), None)))

  override def density = Some(List(( 0.9002 * (g/L), Some( kPa(101.325)), Some(fromCelsius(0)), None, None)))
  override def meltingPoint = Some((K(24.56), None))
  override def boilingPoint = Some((K(27.07), None))
  override def triplePoint = Some((K(24.5561), kPa(43)))
  override def criticalPoint = Some((K(44.4), MPa(2.76)))
  override def heatOfFusion = Some((0.335 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((1.71 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 20.786 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
