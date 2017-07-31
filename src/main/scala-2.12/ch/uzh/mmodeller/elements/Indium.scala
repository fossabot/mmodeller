package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, nOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Indium extends ChemicalElementBase(49, 114.818) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "In"
  def category = Category.PostTransitionMetals
  def group = 13
  def period = 5
  def block = 'p'
  def appearance = "silvery lustrous gray"
  def electronConfiguration = "[Kr] 4d10 5s2 5p1"
  def electronsPerShell = List(2, 8, 18, 18, 3)
  def crystalStructure = "tetragonal"
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-74-6"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.78)
  override def ionizationEnergies = Some(Map("1st" -> 558.3 * (kJ/mol), "2nd" -> 1820.7 * (kJ/mol), "3rd" -> 2704 * (kJ/mol)))
  override def atomicRadius = Some(pm(155))
  override def atomicRadiusCalc = Some(pm(156))
  override def covalentRadius = Some(pm(144))
  override def vanDerWaalsRadius = Some(pm(193))
  override def electricalResistivity = Some((83.7 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((81.8 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((32.1 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((1215 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(11), None)))
  override def mohsHardness = Some(List((1.2, None)))
  override def brinellHardness = Some(List((MPa(8.83), None)))

  override def density = Some(List((7.31 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (7.02 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(429.7485), None))
  override def boilingPoint = Some((K(2345), None))
  override def heatOfFusion = Some((3.281 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((231.8 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((26.74 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
