package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, Ohm}
import ch.uzh.utils.units.Length.{pm, m}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Sulfur extends ChemicalElementBase(16, 32.065) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "S"
  def category = Category.NonMetal
  def group = 16
  def period = 3
  def block = 'p'
  def appearance = "Lemon yellow crystals."
  def electronConfiguration = "[Ne] 3s2 3p4"
  def electronsPerShell = List(2, 8, 6)
  def crystalStructure = "orthorhombic"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7704-34-9"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(6, 4, 2, 1, -2))
  override def electronNegativity = Some(2.58)
  override def ionizationEnergies = Some(Map("1st" -> 999.6 * (kJ/mol), "2nd" -> 2252 * (kJ/mol), "3rd" -> 3357 * (kJ/mol)))
  override def atomicRadius = Some(pm(100))
  override def atomicRadiusCalc = Some(pm(88))
  override def covalentRadius = Some(pm(102))
  override def vanDerWaalsRadius = Some(pm(180))
  override def electricalResistivity = Some((2* Math.pow(10, 15) * Ohm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((0.205 * (W/m*K), Some(K(300)), Some("amorphous"))))

  override def bulkModulus = Some(List((GPa(7.7), None)))
  override def mohsHardness = Some(List((2, None)))

  override def density = Some(List((1.819 * (g/cm3), None, None, None, Some(MaterialState.Liquid)), (2.07 * (g/cm3), None, None, Some("alpha"), Some(MaterialState.Solid)), (1.96 * (g/cm3), None, None, Some("beta"), Some(MaterialState.Solid)), (1.92 * (g/cm3), None, None, Some("gamma"), Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(388.36), None))
  override def boilingPoint = Some((K(717.8), None))
  override def criticalPoint = Some((K(1314), MPa(20.7)))
  override def heatOfFusion = Some((1.727 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((45 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 22.75 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
