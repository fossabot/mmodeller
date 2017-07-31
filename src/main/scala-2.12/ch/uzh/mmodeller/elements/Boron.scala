package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, Ohm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Boron extends ChemicalElementBase(5, 10.811) with ChemicalGroup with MagneticOrdering {
  def symbol = "B"
  def category = Category.Metalloids
  def group = 13
  def period = 2
  def block = 'p'
  def appearance = "black/brown"
  def electronConfiguration = "[He] 2s2 2p1"
  def electronsPerShell = List(2, 3)
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-42-8"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4, 3, 1))
  override def electronNegativity = Some(2.04)
  override def ionizationEnergies = Some(Map("1st" -> 800.6 * (kJ/mol), "2nd" -> 2427.1 * (kJ/mol), "3rd" -> 3659.7 * (kJ/mol)))
  override def atomicRadius = Some(pm(85))
  override def atomicRadiusCalc = Some(pm(87))
  override def covalentRadius = Some(pm(82))
  override def electricalResistivity = Some((106 * Ohm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((27.4 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some(6 * (um/m*K), Some(fromCelsius(25)), Some("ß form"))

  override def speedOfSound = Some(List((16200 * (m/s), Some(fromCelsius(20)), None, None)))
  override def mohsHardness = Some(List((9.5, None)))

  override def density = Some(List((2.08 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(2349), None))
  override def boilingPoint = Some((K(4200), None))
  override def heatOfFusion = Some((50.2 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((480 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List(( 11.087 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
