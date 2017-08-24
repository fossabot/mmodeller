package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, nOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.{GPa, MPa}
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Sodium extends ChemicalElementBase(11, 22.98976928) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Na"
  def category = Category.AlkaliMetals
  def group = 1
  def period = 3
  def block = 's'
  def appearance = "silvery white"
  def electronConfiguration = "[Ne] 3s1"
  def electronsPerShell = List(2,8,1)
  def crystalStructure = "cubic body centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-23-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(1))
  override def electronNegativity = Some(0.93)
  override def ionizationEnergies = Some(Map("1st" -> 495.8 * (kJ/mol), "2nd" -> 4562 * (kJ/mol), "3rd" -> 6910.3 * (kJ/mol)))
  override def atomicRadius = Some(pm(180))
  override def atomicRadiusCalc = Some(pm(190))
  override def covalentRadius = Some(pm(154))
  override def vanDerWaalsRadius = Some(pm(227))
  override def electricalResistivity = Some((47.7 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((142 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((71 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3200 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(10), None)))
  override def shearModulus = Some(List((GPa(3.3), None)))
  override def bulkModulus = Some(List((GPa(6.3), None)))
  override def mohsHardness = Some(List((0.5, None)))
  override def brinellHardness = Some(List((MPa(0.69), None)))

  override def density = Some(List((0.968 * (g/cm3), None, None, None, Some(MaterialState.Solid)),(0.927 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(370.87), None))
  override def boilingPoint = Some((K(1156), None))
  override def criticalPoint = Some((  K(2573), MPa(35)))
  override def heatOfFusion = Some((2.60 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((97.42 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 28.230 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
