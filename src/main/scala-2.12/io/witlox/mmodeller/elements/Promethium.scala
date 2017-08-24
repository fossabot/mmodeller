package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}
import io.witlox.mmodeller.utils.units.Energy.{W, kJ, uOhm}
import io.witlox.mmodeller.utils.units.Length.{pm, um, m}
import io.witlox.mmodeller.utils.units.Mass.g
import io.witlox.mmodeller.utils.units.Chemical.mol
import io.witlox.mmodeller.utils.units.Volume.cm3
import io.witlox.mmodeller.utils.units.Pressure.GPa
import io.witlox.mmodeller.utils.units.Temperature.K

object Promethium extends ChemicalElementBase(61, 145.0) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Pm"
  def category = Category.Lanthanoids
  def col = 5
  def row = 1
  def block = 'f'
  def appearance = "metallic"
  def electronConfiguration = "[Xe] 4f5 6s2"
  def electronsPerShell = List(2, 8, 18, 23, 8, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-12-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.13)
  override def ionizationEnergies = Some(Map("1st" -> 540 * (kJ/mol), "2nd" -> 1050 * (kJ/mol), "3rd" -> 2150 * (kJ/mol)))
  override def atomicRadius = Some(pm(185))
  override def atomicRadiusCalc = Some(pm(205))
  override def electricalResistivity = Some((0.75 * uOhm*m, None))
  override def thermalConductivity = Some(List((17.9 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((11 * (um/m*K), None, Some("α")))

  override def youngModulus = Some(List((GPa(46), Some("α"))))
  override def shearModulus = Some(List((GPa(18), Some("α"))))
  override def bulkModulus = Some(List((GPa(33), Some("α"))))
  override def poissonRatio = Some(List((0.28, Some("α"))))

  override def density = Some(List((7.26 * (g/cm3), None, None, None, Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(1315), None))
  override def boilingPoint = Some((K(3273), None))
  override def heatOfFusion = Some((7.13 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((289 * (kJ/mol), None, None))
}
