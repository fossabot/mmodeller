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

object Niobium extends Atomic(41, 92.90638) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Nb"
  def category = Category.TransitionMetals
  def group = 5
  def period = 5
  def block = 'd'
  def appearance = "gray metallic"
  def electronConfiguration = "[Kr] 4d4 5s1"
  def electronsPerShell = List(2, 8, 18, 12, 1)
  def crystalStructure = "cubic body centred"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-03-1"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(5, 4, 3, 2))
  override def electronNegativity = Some(1.6)
  override def ionizationEnergies = Some(Map("1st" -> 652.1 * (kJ/mol), "2nd" -> 1380 * (kJ/mol), "3rd" -> 2416 * (kJ/mol)))
  override def atomicRadius = Some(pm(145))
  override def atomicRadiusCalc = Some(pm(198))
  override def covalentRadius = Some(pm(137))
  override def electricalResistivity = Some((152 * nOhm*m, Some(fromCelsius(0))))
  override def thermalConductivity = Some(List((53.7 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((7.3 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3480 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(105), None)))
  override def shearModulus = Some(List((GPa(38), None)))
  override def bulkModulus = Some(List((GPa(170), None)))
  override def poissonRatio = Some(List((0.4, None)))
  override def mohsHardness = Some(List((6, None)))
  override def vickersHardness = Some(List((MPa(1320), None)))
  override def brinellHardness = Some(List((MPa(736), None)))

  override def density = Some(List((8.57 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(2750), None))
  override def boilingPoint = Some((K(5017), None))
  override def heatOfFusion = Some((30 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((689.9 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((24.60 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
