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

object Rhenium extends ChemicalElementBase(75, 186.207) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Re"
  def category = Category.TransitionMetals
  def group = 7
  def period = 6
  def block = 'd'
  def appearance = "grayish white"
  def electronConfiguration = "[Xe] 4f14 5d5 6s2"
  def electronsPerShell = List(2, 8, 18, 32, 13, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-15-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(7, 6, 5, 4, 3, 2, 1, -1, -2, -3))
  override def electronNegativity = Some(1.9)
  override def ionizationEnergies = Some(Map("1st" -> 760 * (kJ/mol), "2nd" -> 1260 * (kJ/mol), "3rd" -> 2510 * (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def atomicRadiusCalc = Some(pm(188))
  override def covalentRadius = Some(pm(159))
  override def electricalResistivity = Some((193 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((48.0 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((6.2 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((4700 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(463), None)))
  override def shearModulus = Some(List((GPa(178), None)))
  override def bulkModulus = Some(List((GPa(370), None)))
  override def poissonRatio = Some(List((0.3, None)))
  override def mohsHardness = Some(List((7, None)))
  override def vickersHardness = Some(List((MPa(2450), None)))
  override def brinellHardness = Some(List((MPa(1320), None)))

  override def density = Some(List((21.02 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (18.9 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(3459), None))
  override def boilingPoint = Some((K(5869), None))
  override def heatOfFusion = Some((60.43 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((704 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.48 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
