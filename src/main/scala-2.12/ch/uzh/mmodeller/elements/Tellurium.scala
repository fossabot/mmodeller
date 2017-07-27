package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, eV}
import ch.uzh.utils.units.Length.{m, pm}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Tellurium extends Atomic(52, 127.60) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Te"
  def category = Category.Metalloids
  def group = 16
  def period = 5
  def block = 'p'
  def appearance = "silvery lustrous gray"
  def electronConfiguration = "[Kr] 5s2 4d10 5p4"
  def electronsPerShell = List(2, 8, 18, 18, 6)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "diamagnetic"
  def casNumber = "13494-80-9"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2, 4, 6))
  override def electronNegativity = Some(2.1)
  override def ionizationEnergies = Some(Map("1st" -> 869.3 * (kJ/mol), "2nd" -> 1790 * (kJ/mol), "3rd" -> 2698 * (kJ/mol)))
  override def atomicRadius = Some(pm(140))
  override def atomicRadiusCalc = Some(pm(123))
  override def covalentRadius = Some(pm(135))
  override def vanDerWaalsRadius = Some(pm(206))
  override def thermalConductivity = Some(List((3.0 * (W/m*K), Some(K(300)), None)))
  override def bandGapEnergy = Some((0.33 * eV, K(302), None))

  override def speedOfSound = Some(List((2610 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(43), None)))
  override def shearModulus = Some(List((GPa(16), None)))
  override def bulkModulus = Some(List((GPa(65), None)))
  override def mohsHardness = Some(List((2.25, None)))
  override def brinellHardness = Some(List((MPa(180), None)))

  override def density = Some(List((6.24 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (5.70 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(722.66), None))
  override def boilingPoint = Some((K(1261), None))
  override def heatOfFusion = Some((17.49 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((114.1 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.73 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
