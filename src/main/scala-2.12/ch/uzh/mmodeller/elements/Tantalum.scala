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

object Tantalum extends Atomic(73, 180.9488) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
def symbol = "Ta"
  def category = Category.TransitionMetals
  def group = 5
  def period = 6
  def block = 'd'
  def appearance = "gray blue"
  def electronConfiguration = "[Xe] 4f14 5d3 6s2"
  def electronsPerShell = List(2, 8, 18, 32, 11, 2)
  def crystalStructure = "cubic body centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-25-7"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(5, 4, 3))
  override def electronNegativity = Some(1.5)
  override def ionizationEnergies = Some(Map("1st" -> 761* (kJ/mol), "2nd" -> 1500* (kJ/mol)))
  override def atomicRadius = Some(pm(145))
  override def atomicRadiusCalc = Some(pm(200))
  override def covalentRadius = Some(pm(138))
  override def electricalResistivity = Some((131 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((57.5 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((6.3 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3400 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(186), None)))
  override def shearModulus = Some(List((GPa(69), None)))
  override def bulkModulus = Some(List((GPa(200), None)))
  override def poissonRatio = Some(List((0.34, None)))
  override def mohsHardness = Some(List((6.5, None)))
  override def vickersHardness = Some(List((MPa(873), None)))
  override def brinellHardness = Some(List((MPa(800), None)))

  override def density = Some(List((16.69 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (15 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(3290), None))
  override def boilingPoint = Some((K(5731), None))
  override def heatOfFusion = Some((36.57 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((732.8 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.36 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}