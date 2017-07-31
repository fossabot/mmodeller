package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{W, kJ}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa, kPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Potassium extends ChemicalElementBase(19, 39.0983) with ChemicalGroup with CrystalStructure with MagneticOrdering  {
  def symbol = "K"
  def category = Category.AlkaliMetals
  def group = 1
  def period = 4
  def block = 's'
  def appearance = "silvery white"
  def electronConfiguration = "[Ar] 4s1"
  def electronsPerShell = List(2, 8, 8, 1)
  def crystalStructure = "cubic body centered"
  def magneticOrdering = "paramagnetic"
  def casNumber = "7440-09-7"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(1))
  override def electronNegativity = Some(0.82)
  override def ionizationEnergies = Some(Map("1st" -> 418.8 * (kJ/mol), "2nd" -> 3052 * (kJ/mol), "3rd" -> 4420 * (kJ/mol)))
  override def atomicRadius = Some(pm(220))
  override def atomicRadiusCalc = Some(pm(243))
  override def covalentRadius = Some(pm(196))
  override def vanDerWaalsRadius = Some(pm(275))
  override def thermalConductivity = Some(List((102.5 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((83.3 * (um/m*K), Some(fromCelsius(25)), None))

  override def speedOfSound = Some(List((2000 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(3.53), None)))
  override def shearModulus = Some(List((GPa(1.3), None)))
  override def bulkModulus = Some(List((GPa(3.1), None)))
  override def mohsHardness = Some(List((0.4, None)))
  override def brinellHardness = Some(List((MPa(0.363), None)))

  override def density = Some(List((0.89 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (0.828 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(336.53), None))
  override def boilingPoint = Some((K(1032), None))
  override def triplePoint = Some((K(336.35), kPa(1)))
}
