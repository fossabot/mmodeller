package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, eV}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, atm}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Carbon extends ChemicalElementBase(6, 12.0107) with ChemicalGroup with MagneticOrdering {
  def symbol = "C"
  def category = Category.NonMetal
  def group = 14
  def period = 2
  def block = 'p'
  def phase = MaterialState.Solid
  def appearance = "Black (Graphite), Clear (Diamond)"
  def electronConfiguration = "1s2 2s2 2p2 or [He] 2s2 2p2"
  def electronsPerShell = List(2,4)
  def magneticOrdering = "diamagnetic"
  def casNumber = "7440-44-0"

  override def electronNegativity = Some(2.55)
  override def ionizationEnergies = Some(Map("1st" -> 1086.5 * (kJ/mol), "2nd" -> 2352.6 * (kJ/mol), "3rd" -> 4620.5 * (kJ/mol)))
  override def atomicRadius = Some(pm(70))
  override def atomicRadiusCalc = Some(pm(67))
  override def covalentRadius = Some(pm(77))
  override def vanDerWaalsRadius = Some(pm(170))
  override def thermalConductivity = Some(List((140 * (W/m*K), Some(K(300)), Some("graphite")), (2200 * (W/m*K), None, Some("diamond"))))
  override def thermalExpansion = Some((0.8 * (um/m*K), Some(fromCelsius(25)), Some("diamond")))
  override def bandGapEnergy = Some((5.5 * eV, K(302), Some("diamond")))

  override def speedOfSound = Some(List((18350 * (m/s), Some(fromCelsius(20)), Some(MaterialState.Solid), Some("diamond"))))
  override def youngModulus = Some(List((GPa(1050), Some("diamond"))))
  override def shearModulus = Some(List((GPa(478), Some("diamond"))))
  override def bulkModulus = Some(List((GPa(442), Some("diamond"))))
  override def poissonRatio = Some(List((0.1, Some("diamond"))))
  override def mohsHardness = Some(List((1-2, Some("graphite")), (10, Some("diamond"))))

  override def density = Some(List(( 1 * (g/cm3), None, Some(fromCelsius(0)), Some("amorphous"), Some(MaterialState.Solid)), (2.267 * (g/cm3), None, Some(fromCelsius(0)), Some("graphite"), Some(MaterialState.Solid)), (3.515 * (g/cm3), None, Some(fromCelsius(0)), Some("diamond"), Some(MaterialState.Solid))))
  override def meltingPoint = Some((K(3800), Some(1 * atm)))
  override def boilingPoint = Some((K(4300), Some(1 * atm)))
  override def heatOfFusion = Some((117 * (kJ/mol), None, Some("graphite")))
  override def specificHeatCapacity = Some(List((8.517 * (J/mol*K), Some(fromCelsius(25)), None, Some("graphite")), (6.155 * (J/mol*K), Some(fromCelsius(25)), None, Some("diamond"))))
}
