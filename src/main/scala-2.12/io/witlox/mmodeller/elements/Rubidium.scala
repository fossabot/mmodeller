package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, nOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Rubidium extends ChemicalElementBase(37, 85.4678) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Rb"
  def category = Category.AlkaliMetals
  def group = 1
  def period = 5
  def block = 's'
  def appearance = "grey white"
  def electronConfiguration = "[Kr] 5s1"
  def electronsPerShell = List(2, 8, 18, 8, 1)
  def crystalStructure = "body centered cubic"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-17-7"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(1))
  override def electronNegativity = Some(0.82)
  override def ionizationEnergies = Some(Map("1st" -> 403.0 * (kJ/mol), "2nd" -> 2633 * (kJ/mol), "3rd" -> 3860 * (kJ/mol)))
  override def atomicRadius = Some(pm(235))
  override def atomicRadiusCalc = Some(pm(265))
  override def covalentRadius = Some(pm(211))
  override def vanDerWaalsRadius = Some(pm(244))
  override def electricalResistivity = Some((128 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((58.2 * (W/m*K), Some(K(300)), None)))

  override def speedOfSound = Some(List((1300 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(2.4), None)))
  override def bulkModulus = Some(List((GPa(2.5), None)))
  override def mohsHardness = Some(List((0.3, None)))
  override def brinellHardness = Some(List((MPa(0.216), None)))

  override def density = Some(List((1.532 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (1.46 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(312.46), None))
  override def boilingPoint = Some((K(961), None))
  override def criticalPoint = Some((K(2093), MPa(16)))
  override def heatOfFusion = Some((2.19 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((75.77 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((31.060 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
