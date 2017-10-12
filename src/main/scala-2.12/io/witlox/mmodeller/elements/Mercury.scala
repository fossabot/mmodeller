package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, W, kJ, nOhm}
import io.witlox.mmodeller.utils.units.Length.{m, pm, um}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Time.s
import io.witlox.mmodeller.utils.units.Pressure.MPa
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Mercury extends ChemicalElementBase(80, 200.59) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Hg"
  def category = Category.TransitionMetals
  def group = 12
  def period = 6
  def block = 'd'
  def appearance = "silvery"
  def electronConfiguration = "[Xe] 4f14 5d10 6s2"
  def electronsPerShell = List(2, 8, 18, 32, 18, 2)
  def crystalStructure = "rhombohedral"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7439-97-6"
  def phase = MaterialState.Liquid

  override def oxidationStates = Some(List(2 , 1))
  override def electronNegativity = Some(2.00)
  override def ionizationEnergies = Some(Map("1st" -> 1007.1* (kJ/mol), "2nd" -> 1810* (kJ/mol), "3rd" -> 3300* (kJ/mol)))
  override def atomicRadius = Some(pm(150))
  override def atomicRadiusCalc = Some(pm(171))
  override def covalentRadius = Some(pm(149))
  override def vanDerWaalsRadius = Some(pm(155))
  override def electricalResistivity = Some((961 * nOhm*m, Some(fromCelsius(25))))
  override def thermalConductivity = Some(List((8.30 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((60.4 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((1451.4 * (m/s), Some(fromCelsius(20)), Some(MaterialState.Liquid), None)))

  override def density = Some(List((13.534 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(234.32), None))
  override def boilingPoint = Some((K(629.88), None))
  override def criticalPoint = Some((K(1750), MPa(172.00)))
  override def heatOfFusion = Some((2.29 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((59.11 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((27.983 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
