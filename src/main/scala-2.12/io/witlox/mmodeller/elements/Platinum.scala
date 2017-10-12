package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, nOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Platinum extends ChemicalElementBase(78, 195.084) with ChemicalGroup with CrystalStructure with MagneticOrdering with TensileStrength  {
def symbol = "Pt"
  def category = Category.TransitionMetals
  def group = 10
  def period = 6
  def block = 'd'
  def appearance = "grayish white"
  def electronConfiguration = "[Xe] 4f14 5d9 6s1"
  def electronsPerShell = List(2, 8, 18, 32, 17, 1)
  def casNumber = "7440-06-4"
  def phase = MaterialState.Solid
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "paramagnetic"
  def tensileStrength = MPa(125)

  override def oxidationStates = Some(List(1, 2, 3, 4, 5, 6))
  override def electronNegativity = Some(2.28)
  override def ionizationEnergies = Some(Map("1st" -> 870* (kJ/mol), "2nd" -> 1791* (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def atomicRadiusCalc = Some(pm(177))
  override def covalentRadius = Some(pm(128))
  override def vanDerWaalsRadius = Some(pm(175))
  override def electricalResistivity = Some((105 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((71.6 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((8.8 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((2800 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(168), None)))
  override def shearModulus = Some(List((GPa(61), None)))
  override def bulkModulus = Some(List((GPa(230), None)))
  override def poissonRatio = Some(List((0.38, None)))
  override def mohsHardness = Some(List((4.3, None)))
  override def vickersHardness = Some(List((MPa(549), None)))
  override def brinellHardness = Some(List((MPa(392), None)))

  override def density = Some(List((21.45 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (19.77 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(2041.4), None))
  override def boilingPoint = Some((K(4098), None))
  override def heatOfFusion = Some((22.17 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((469 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.86 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
