package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.GPa
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Barium extends Atomic(56, 137.327) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Ba"
  def category = Category.AlkalineEarthMetals
  def group = 2
  def period = 6
  def block = 's'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 6s2"
  def electronsPerShell = List(2, 8, 18, 18, 8, 2)
  def crystalStructure = "cubic body centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-39-3"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2))
  override def electronNegativity = Some(0.89)
  override def ionizationEnergies = Some(Map("1st" -> 502.9 * (kJ/mol), "2nd" -> 965.2 * (kJ/mol), "3rd" -> 3600 * (kJ/mol)))
  override def atomicRadius = Some(pm(215))
  override def atomicRadiusCalc = Some(pm(253))
  override def covalentRadius = Some(pm(198))
  override def electricalResistivity = Some((332 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((18.4 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((20.6 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((1620 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(13), None)))
  override def shearModulus = Some(List((GPa(4.9), None)))
  override def bulkModulus = Some(List((GPa(9.6), None)))
  override def mohsHardness = Some(List((1.25, None)))

  override def density = Some(List((3.51 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (3.338 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1000), None))
  override def boilingPoint = Some((K(2170), None))
  override def heatOfFusion = Some((7.12 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((140.3 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 28.07 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
