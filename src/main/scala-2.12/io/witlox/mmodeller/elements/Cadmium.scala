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

object Cadmium extends ChemicalElementBase(48, 112.411) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Cd"
  def category = Category.TransitionMetals
  def group = 12
  def period = 5
  def block = 'd'
  def appearance = "silvery gray metallic"
  def electronConfiguration = "[Kr] 5s2 4d10"
  def electronsPerShell = List(2, 8, 18, 18, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-43-9"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2, 1))
  override def electronNegativity = Some(1.69)
  override def ionizationEnergies = Some(Map("1st" -> 867.8* (kJ/mol), "2nd" -> 1631.4* (kJ/mol), "3rd" -> 3616* (kJ/mol)))
  override def atomicRadius = Some(pm(155))
  override def atomicRadiusCalc = Some(pm(161))
  override def covalentRadius = Some(pm(148))
  override def vanDerWaalsRadius = Some(pm(158))
  override def electricalResistivity = Some((72.7 * nOhm*m, Some(fromCelsius(22))))
  override def thermalConductivity = Some(List((96.6 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((30.8 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((2310 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(50), None)))
  override def shearModulus = Some(List((GPa(19), None)))
  override def bulkModulus = Some(List((GPa(42), None)))
  override def poissonRatio = Some(List((0.3, None)))
  override def mohsHardness = Some(List((2, None)))
  override def brinellHardness = Some(List((MPa(203), None)))

  override def density = Some(List((8.65 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (7.996 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(594.22), None))
  override def boilingPoint = Some((K(1040), None))
  override def heatOfFusion = Some((6.21 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((99.87 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.020 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
