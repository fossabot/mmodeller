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

object Xenon extends ChemicalElementBase(54, 131.293) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Xe"
  def category = Category.NobleGases
  def group = 18
  def period = 5
  def block = 'p'
  def appearance = "colorless gas"
  def electronConfiguration = "[Kr] 5s2 4d10 5p6"
  def electronsPerShell = List(2, 8, 18, 18, 8)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-63-3"
  def phase = MaterialState.Gas

  override def oxidationStates = Some(List(0, +1, +2, +4, +6, +8))
  override def electronNegativity = Some(2.6)
  override def ionizationEnergies = Some(Map("1st" -> 1170.4 * (kJ/mol), "2nd" -> 2046.4 * (kJ/mol), "3rd" -> 3099.4 * (kJ/mol)))
  override def atomicRadiusCalc = Some(pm(108))
  override def covalentRadius = Some(pm(130))
  override def vanDerWaalsRadius = Some(pm(216))
  override def thermalConductivity = Some(List((5.65 * Math.pow(10, -3)  * (W/m*K), Some(K(300)), None)))

  override def speedOfSound = Some(List((1090 * (m/s), None, Some(MaterialState.Liquid), None), (169 * (m/s), None, Some(MaterialState.Gas), None)))

  override def density = Some(List((5.894 * (g/L), Some(kPa(101.325)), Some(fromCelsius(0)), None, None)))
  override def meltingPoint = Some((K(161.4), Some(kPa(101.325))))
  override def boilingPoint = Some((K(165.03), Some(kPa(101.325))))
  override def triplePoint = Some((K(161.405), kPa(81.6)))
  override def criticalPoint = Some((K(289.77), MPa(5.841)))
  override def heatOfFusion = Some((2.27 * (kJ/mol), Some(kPa(101.325)), None))
  override def heatOfVaporization = Some((12.64 * (kJ/mol), Some(kPa(101.325)), None))
  override def specificHeatCapacity = Some(List((20.786 * (J/mol*K), Some(fromCelsius(25)), Some(kPa(100)), None)))
}
