package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Selenium extends Atomic(34, 78.96) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Se"
  def category = Category.NonMetal
  def group = 16
  def period = 4
  def block = 'p'
  def appearance = "gray-black, metallic luster"
  def electronConfiguration = "[Ar] 4s2 3d10 4p4"
  def electronsPerShell = List(2, 8, 18, 6)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7782-49-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(6, 4, 2, 1, -2))
  override def electronNegativity = Some(2.55)
  override def ionizationEnergies = Some(Map("1st" -> 941.0 * (kJ/mol), "2nd" -> 2045 * (kJ/mol), "3rd" -> 2973.7 * (kJ/mol)))
  override def atomicRadius = Some(pm(115))
  override def atomicRadiusCalc = Some(pm(103))
  override def covalentRadius = Some(pm(116))
  override def vanDerWaalsRadius = Some(pm(190))
  override def thermalConductivity = Some(List((0.519 * (W/m*K), Some(K(300)), Some("amorphous"))))
  override def thermalExpansion = Some((37 * (um/m*K), Some(fromCelsius(25)), Some("amorphous")))

  override def speedOfSound = Some(List((3350 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(10), None)))
  override def shearModulus = Some(List((GPa(3.7), None)))
  override def bulkModulus = Some(List((GPa(8.3), None)))
  override def poissonRatio = Some(List((0.33, None)))
  override def mohsHardness = Some(List((2, None)))
  override def brinellHardness = Some(List((MPa(736), None)))

  override def density = Some(List((3.99 * (g/cm3), None, None, None, Some(MaterialState.Liquid)), (4.81 * (g/cm3), None, None, Some("gray"), Some(MaterialState.Solid)), (4.39 * (g/cm3), None, None, Some("alpha"), Some(MaterialState.Solid)), (4.28 * (g/cm3), None, None, Some("vitreous"), Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(494), None))
  override def boilingPoint = Some((K(958), None))
  override def criticalPoint = Some((K(1766), MPa(27.2)))
  override def heatOfFusion = Some((6.69 * (kJ/mol), None, Some("gray")))
  override def heatOfVaporization = Some((95.48 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.363 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
