package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.Units._
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Energy.{W, kJ}
import io.witlox.mmodeller.utils.units.Length.m
import io.witlox.mmodeller.utils.units.Temperature.K

object Astatine extends ChemicalElementBase(85, 210.0) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
def symbol = "At"
  def category = Category.Halogens
  def group = 17
  def period = 6
  def block = 'p'
  def appearance = "black solid (presumed)"
  def electronConfiguration = "[Xe] 4f14 5d10 6s2 6p5"
  def electronsPerShell = List(2, 8, 18, 32, 18, 7)
  def crystalStructure = "no data"
  def magneticOrdering = "no data"
  def casNumber = "7440-68-8"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(1, 3, 5, 7))
  override def electronNegativity = Some(2.2)
  override def ionizationEnergies = Some(Map("1st" -> 890 * (kJ/mol)))
  override def thermalConductivity = Some(List((1.7 * (W/m*K), Some(K(300)), None)))
  override def meltingPoint = Some((K(575), None))
  override def boilingPoint = Some((K(610), None))
  override def heatOfVaporization = Some((40 * (kJ/mol), None, None))
}
