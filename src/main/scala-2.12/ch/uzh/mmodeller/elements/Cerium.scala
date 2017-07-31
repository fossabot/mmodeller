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

object Cerium extends ChemicalElementBase(58, 140.116) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Ce"
  def category = Category.Lanthanoids
  def col = 2
  def row = 1
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 4f1 5d1 6s2"
  def electronsPerShell = List(2, 8, 18, 19, 9, 2)
  def crystalStructure = "face-centered cubic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-45-1"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 4))
  override def electronNegativity = Some(1.12)
  override def ionizationEnergies = Some(Map("1st" -> 534.4 * (kJ/mol), "2nd" -> 1050 * (kJ/mol), "3rd" -> 1949 * (kJ/mol)))
  override def atomicRadius = Some(pm(185))
  override def electricalResistivity = Some((828 * nOhm*m, None))
  override def thermalConductivity = Some(List((11.3 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((6.3 * (um/m*K), None, Some("γ")))

  override def speedOfSound = Some(List((2100 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(33.6), Some("γ"))))
  override def shearModulus = Some(List((GPa(13.5), Some("γ"))))
  override def bulkModulus = Some(List((GPa(21.5), Some("γ"))))
  override def poissonRatio = Some(List((0.24, Some("γ"))))
  override def mohsHardness = Some(List((2.5, None)))
  override def vickersHardness = Some(List((MPa(270), None)))
  override def brinellHardness = Some(List((MPa(412), None)))

  override def density = Some(List((6.770 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (6.55 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1068), None))
  override def boilingPoint = Some((K(3716), None))
  override def heatOfFusion = Some((5.46 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((398 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.94 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
