package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, nOhm}
import io.witlox.mmodeller.utils.units.Length.{pm, um, m}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Pressure.GPa
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Strontium extends ChemicalElementBase(38, 87.62) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Sr"
  def category = Category.AlkalineEarthMetals
  def group = 2
  def period = 5
  def block = 's'
  def appearance = "silvery white metallic"
  def electronConfiguration = "[Kr] 5s2"
  def electronsPerShell = List(2, 8, 18, 8, 2)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-24-6"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2, 1))
  override def electronNegativity = Some(0.95)
  override def ionizationEnergies = Some(Map("1st" -> 549.5 * (kJ/mol), "2nd" -> 1064.2 * (kJ/mol), "3rd" -> 4138 * (kJ/mol)))
  override def atomicRadius = Some(pm(200))
  override def atomicRadiusCalc = Some(pm(219))
  override def covalentRadius = Some(pm(192))
  override def electricalResistivity = Some((132 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((35.4 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((22.5 * (um/m*K), Some(fromCelsius(25)), None))

  override def shearModulus = Some(List((GPa(6.1), None)))
  override def poissonRatio = Some(List((0.28, None)))
  override def mohsHardness = Some(List((1.5, None)))

  override def density = Some(List((2.64 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (2.375 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1050), None))
  override def boilingPoint = Some((K(1655), None))
  override def heatOfFusion = Some((7.43 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((136.9 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.4 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
