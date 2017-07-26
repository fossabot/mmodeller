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

object Iron extends Atomic(26, 55.845) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Fe"
  def category = Category.TransitionMetals
  def group = 8
  def period = 4
  def block = 'd'
  def appearance = "lustrous metallic with a grayish tinge"
  def electronConfiguration = "[Ar] 3d6 4s2"
  def electronsPerShell = List(2, 8, 14, 2)
  def crystalStructure = "body-centered cubic; a=286.65 pm;"
  def magneticOrdering = "ferromagnetic, K(1043)"
  def casNumber = "7439-89-6"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(6, 5, 4, 3, 2, 1))
  override def electronNegativity = Some(1.83)
  override def ionizationEnergies = Some(Map("1st" -> 762.5 * (kJ/mol), "2nd" -> 1561.9 * (kJ/mol), "3rd" -> 2957 * (kJ/mol)))
  override def atomicRadius = Some(pm(140))
  override def atomicRadiusCalc = Some(pm(156))
  override def covalentRadius = Some(pm(125))
  override def electricalResistivity = Some((96.1 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((80.4 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((11.8 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((5120 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(211), None)))
  override def shearModulus = Some(List((GPa(82), None)))
  override def bulkModulus = Some(List((GPa(170), None)))
  override def poissonRatio = Some(List((0.29, None)))
  override def mohsHardness = Some(List((4, None)))
  override def vickersHardness = Some(List((MPa(608), None)))
  override def brinellHardness = Some(List((MPa(490), None)))

  override def density = Some(List((7.874 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (6.98 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1811), None))
  override def boilingPoint = Some((K(3134), None))
  override def heatOfFusion = Some((13.81 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((340 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 25.10 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
