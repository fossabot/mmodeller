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

object Zirconium extends ChemicalElementBase(40, 91.224) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "Zr"
  def category = Category.TransitionMetals
  def group = 4
  def period = 5
  def block = 'd'
  def appearance = "silvery white"
  def electronConfiguration = "[Kr] 4d2 5s2"
  def electronsPerShell = List(2, 8, 18, 10, 2)
  def crystalStructure = "hexagonal close-packed"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-67-7"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(4, 3,2, 1))
  override def electronNegativity = Some(1.33)
  override def ionizationEnergies = Some(Map("1st" -> 640.1 * (kJ/mol), "2nd" -> 1270 * (kJ/mol), "3rd" -> 2218 * (kJ/mol)))
  override def atomicRadius = Some(pm(155))
  override def atomicRadiusCalc = Some(pm(206))
  override def covalentRadius = Some(pm(148))
  override def electricalResistivity = Some((421 * nOhm*m, Some(fromCelsius(20))))
  override def thermalConductivity = Some(List((22.6 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((5.7 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((3800 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(68), None)))
  override def shearModulus = Some(List((GPa(33), None)))
  override def poissonRatio = Some(List((0.34, None)))
  override def mohsHardness = Some(List((5, None)))
  override def vickersHardness = Some(List((MPa(903), None)))
  override def brinellHardness = Some(List((MPa(650), None)))

  override def density = Some(List((6.52 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (5.8 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(2128), None))
  override def boilingPoint = Some((K(4682), None))
  override def heatOfFusion = Some((14 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((573 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((25.36 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
