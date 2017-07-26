package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Area.mm2
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Silver extends Atomic(47, 107.8682) with ChemicalGroup with CrystalStructure with MagneticOrdering with ThermalDiffusivity  {
def symbol = "Ag"
  def category = Category.TransitionMetals
  def group = 11
  def period = 5
  def block = 'd'
  def appearance = "lustrous white metal"
  def electronConfiguration = "[Kr] 4d10 5s1"
  def electronsPerShell = List(2, 8, 18, 18, 1)
  def crystalStructure = "face-centered cubic"
  def thermalDiffusivity = (174 * (mm2/s), K(300))
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-22-4"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(1, 2, 3))
  override def electronNegativity = Some(1.93)
  override def ionizationEnergies = Some(Map("1st" -> 731.0* (kJ/mol), "2nd" -> 2070* (kJ/mol), "3rd" -> 3361* (kJ/mol)))
  override def atomicRadius = Some(pm(160))
  override def atomicRadiusCalc = Some(pm(165))
  override def covalentRadius = Some(pm(153))
  override def vanDerWaalsRadius = Some(pm(172))
  override def electricalResistivity = Some((15.87 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((429 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((18.9 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((2680 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(83), None)))
  override def shearModulus = Some(List((GPa(30), None)))
  override def bulkModulus = Some(List((GPa(100), None)))
  override def poissonRatio = Some(List((0.37, None)))
  override def mohsHardness = Some(List((2.5, None)))
  override def vickersHardness = Some(List((MPa(251), None)))
  override def brinellHardness = Some(List((MPa(24.5), None)))

  override def density = Some(List((10.49 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (9.320 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1234.93), None))
  override def boilingPoint = Some((K(2435), None))
  override def heatOfFusion = Some((11.28 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((250.58 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.350 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
