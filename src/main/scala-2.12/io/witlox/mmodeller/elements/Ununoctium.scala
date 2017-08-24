package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.kJ
import io.witlox.mmodeller.utils.units.Length.pm
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Pressure.MPa
import io.witlox.mmodeller.utils.units.Temperature.K

object Ununoctium extends ChemicalElementBase(118, 294.0) with ChemicalGroup {
  def symbol = "Uuo"
  def category = Category.NobleGases
  def group = 18
  def period = 7
  def block = 'p'
  def appearance = "Unknown, probably colorless"
  def electronConfiguration = "[Rn] 5f14 6d10 7s2 7p6"
  def electronsPerShell = List(2, 8, 18, 32, 32, 18, 8)
  def casNumber = "54144-19-3"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(0, +2, +4))
  override def ionizationEnergies = Some(Map("1st" -> 1000 * (kJ/mol), "2nd" -> 1450 * (kJ/mol)))
  override def atomicRadius = Some(pm(152))
  override def covalentRadius = Some(pm(230))

  override def density = Some(List((13.65 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def boilingPoint = Some((K(380), None))
  override def criticalPoint = Some((K(439), MPa(6.8)))
  override def heatOfFusion = Some((23.5 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((19.4 * (kJ/mol), None, None))
}
