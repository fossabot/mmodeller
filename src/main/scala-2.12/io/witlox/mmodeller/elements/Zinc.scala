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

object Zinc extends ChemicalElementBase(30, 65.38) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Zn"
  def category = Category.TransitionMetals
  def group = 12
  def period = 4
  def block = 'd'
  def appearance = "bluish pale gray"
  def electronConfiguration = "[Ar] 3d10 4s2"
  def electronsPerShell = List(2, 8, 18, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-66-6"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(0, 1, 2))
  override def electronNegativity = Some(1.65)
  override def ionizationEnergies = Some(Map("1st" -> 906.4 * (kJ/mol), "2nd" -> 1733.3 * (kJ/mol), "3rd" -> 3833 * (kJ/mol)))
  override def atomicRadius = Some(pm(135))
  override def atomicRadiusCalc = Some(pm(142))
  override def covalentRadius = Some(pm(131))
  override def vanDerWaalsRadius = Some(pm(139))
  override def electricalResistivity = Some((59.0 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((116 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((30.2 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3850 * (m/s), None, None, None)))
  override def youngModulus = Some(List((GPa(108), None)))
  override def shearModulus = Some(List((GPa(43), None)))
  override def bulkModulus = Some(List((GPa(70), None)))
  override def poissonRatio = Some(List((0.25, None)))
  override def mohsHardness = Some(List((2.5, None)))
  override def brinellHardness = Some(List((MPa(412), None)))

  override def density = Some(List((7.14 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (6.57 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(692.68), None))
  override def boilingPoint = Some((K(1180), None))
  override def heatOfFusion = Some((7.32 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((123.6 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 25.470 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
