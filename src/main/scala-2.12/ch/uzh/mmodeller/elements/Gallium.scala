package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ}
import ch.uzh.utils.units.Length.{m, pm}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.MPa
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Gallium extends Atomic(31, 69.723) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Ga"
  def category = Category.PostTransitionMetals
  def group = 13
  def period = 4
  def block = 'p'
  def appearance = "silvery white"
  def electronConfiguration = "[Ar] 3d10 4s2 4p1"
  def electronsPerShell = List(2, 8, 18, 3)
  def crystalStructure = "orthorhombic"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-55-3"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3, 2, 1))
  override def electronNegativity = Some(1.81)
  override def ionizationEnergies = Some(Map("1st" -> 578.8 * (kJ/mol), "2nd" -> 1979.3 * (kJ/mol), "3rd" -> 2963 * (kJ/mol)))
  override def atomicRadius = Some(pm(130))
  override def atomicRadiusCalc = Some(pm(136))
  override def covalentRadius = Some(pm(126))
  override def vanDerWaalsRadius = Some(pm(187))
  override def thermalConductivity = Some(List((40.6 * (W/m*K), Some(K(300)), None)))

  override def speedOfSound = Some(List((2740 * (m/s), Some(fromCelsius(20)), None, None)))
  override def mohsHardness = Some(List((1.5, None)))
  override def brinellHardness = Some(List((MPa(60), None)))

  override def density = Some(List((5.91 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (6.095 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(302.9146), None))
  override def boilingPoint = Some((K(2477), None))
  override def heatOfFusion = Some((5.59 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((254 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 25.86 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
