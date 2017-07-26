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

object Cobalt extends Atomic(27, 58.933195) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Co"
  def category = Category.TransitionMetals
  def group = 9
  def period = 4
  def block = 'd'
  def phase = MaterialState.Solid
  def appearance = "hard lustrous gray metal"
  def electronConfiguration = "[Ar] 4s2 3d7"
  def electronsPerShell = List(2, 8, 15, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "ferromagnetic"
  def casNumber = "7440-48-4"

  override def oxidationStates = Some(List(4, 3, 2, 1))
  override def electronNegativity = Some(1.88)
  override def ionizationEnergies = Some(Map("1st" -> 760.4 * (kJ/mol), "2nd" -> 1648 * (kJ/mol), "3rd" -> 3232 * (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def atomicRadiusCalc = Some(pm(152))
  override def covalentRadius = Some(pm(126))
  override def electricalResistivity = Some((62.4 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((100 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((13.0 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((4720 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(209), None)))
  override def shearModulus = Some(List((GPa(75), None)))
  override def bulkModulus = Some(List((GPa(180), None)))
  override def poissonRatio = Some(List((0.31, None)))
  override def mohsHardness = Some(List((5, None)))
  override def vickersHardness = Some(List((MPa(1043), None)))
  override def brinellHardness = Some(List((MPa(700), None)))

  override def density = Some(List((8.90 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (7.75 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1768), None))
  override def boilingPoint = Some((K(3200), None))
  override def heatOfFusion = Some((16.06 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((377 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 24.81 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
