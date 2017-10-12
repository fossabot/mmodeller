package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{J, kJ, mW}
import io.witlox.mmodeller.utils.units.Length.{pm, m}
import io.witlox.mmodeller.utils.units.Pressure.MPa
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Temperature.{K, fromCelsius}

object Radon extends ChemicalElementBase(86, 222.0) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Rn"
  def category = Category.NobleGases
  def group = 18
  def period = 6
  def block = 'p'
  def appearance = "colorless"
  def electronConfiguration = "[Xe] 4f14 5d10 6s2 6p6"
  def electronsPerShell = List(2, 8, 18, 32, 18, 8)
  def crystalStructure = "cubic face centered"
  def magneticOrdering = "non-magnetic"
  def casNumber = "10043-92-2"
  def phase = MaterialState.Gas

  override def oxidationStates = Some(List(0))
  override def electronNegativity = Some(2.2)
  override def ionizationEnergies = Some(Map("1st" -> 1037 * (kJ/mol)))
  override def atomicRadiusCalc = Some(pm(120))
  override def covalentRadius = Some(pm(145))
  override def thermalConductivity = Some(List((3.61 * (mW/m*K), Some(K(300)), None)))

  override def meltingPoint = Some((K(202), None))
  override def boilingPoint = Some((K(211.3), None))
  override def criticalPoint = Some((K(377), MPa(6.28)))
  override def heatOfFusion = Some((3.247 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((18.10 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 20.786 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
