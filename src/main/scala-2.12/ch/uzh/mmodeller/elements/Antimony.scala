package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Antimony extends Atomic(51, 121.760) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Sb"
  def category = Category.Metalloids
  def group = 15
  def period = 5
  def block = 'p'
  def appearance = "silvery lustrous gray"
  def electronConfiguration = "[Kr] 4d10 5s2 5p3"
  def electronsPerShell = List(2, 8, 18, 18, 5)
  def crystalStructure = "rhombohedral"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-36-0"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(-3, 3, 5))
  override def electronNegativity = Some(2.05)
  override def ionizationEnergies = Some(Map("1st" -> 834 * (kJ/mol), "2nd" -> 1594.9 * (kJ/mol), "3rd" -> 2440 * (kJ/mol)))
  override def atomicRadius = Some(pm(145))
  override def atomicRadiusCalc = Some(pm(133))
  override def covalentRadius = Some(pm(138))
  override def electricalResistivity = Some((417 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((24.4 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((11 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3420 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(55), None)))
  override def shearModulus = Some(List((GPa(20), None)))
  override def bulkModulus = Some(List((GPa(42), None)))
  override def mohsHardness = Some(List((3, None)))
  override def brinellHardness = Some(List((MPa(294), None)))

  override def density = Some(List((6.697 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (6.53 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(903.78), None))
  override def boilingPoint = Some((K(1860), None))
  override def heatOfFusion = Some((19.79 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((193.43 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 25.23 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
