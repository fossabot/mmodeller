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

object Osmium extends ChemicalElementBase(76, 190.23) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Os"
  def category = Category.TransitionMetals
  def group = 8
  def period = 6
  def block = 'd'
  def appearance = "silvery, blue cast"
  def electronConfiguration = "[Xe] 4f14 5d6 6s2"
  def electronsPerShell = List(2, 8, 18, 32, 14, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-04-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2))
  override def electronNegativity = Some(2.2)
  override def ionizationEnergies = Some(Map("1st" -> 840* (kJ/mol), "2nd" -> 1600* (kJ/mol)))
  override def atomicRadius = Some(pm(130))
  override def atomicRadiusCalc = Some(pm(185))
  override def covalentRadius = Some(pm(128))
  override def electricalResistivity = Some((81.2 * nOhm*m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((87.6 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((5.1 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((4940 * (m/s), Some(fromCelsius(20)), None, None)))
  override def shearModulus = Some(List((GPa(222), None)))
  override def poissonRatio = Some(List((0.25, None)))
  override def bulkModulus = Some(List((GPa(462), None)))
  override def mohsHardness = Some(List((7, None)))
  override def brinellHardness = Some(List((MPa(3920), None)))

  override def density = Some(List((22.61 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (20 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(3306), None))
  override def boilingPoint = Some((K(5285), None))
  override def heatOfFusion = Some((57.85 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((738 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((24.7 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
