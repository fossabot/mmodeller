package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, mW, kJ}
import ch.uzh.utils.units.Length.{m, pm}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.L
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{kPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Hydrogen extends Atomic(1, 1.00794) with ChemicalGroup with CrystalStructure with MagneticOrdering {
  def symbol = "H"
	def category = Category.NonMetal
	def group = 1
	def period = 1
	def block = 's'
	def appearance = "colorless gas"
	def electronConfiguration = "1s1"
	def electronsPerShell = List(1)
	def crystalStructure = "hexagonal"
  def magneticOrdering = "diamagnetic"
  def casNumber = "1333-74-0"
  def phase = MaterialState.Gas

	override def oxidationStates = Some(List(1, -1))
	override def electronNegativity = Some(2.20)
	override def ionizationEnergies = Some(Map("1st" -> 1312.0 * (kJ/mol)))
	override def atomicRadius = Some(pm(25))
	override def atomicRadiusCalc = Some(pm(53))
	override def covalentRadius = Some(pm(37))
	override def vanDerWaalsRadius = Some(pm(120))
	override def thermalConductivity = Some(List((180.5 * mW/m*K, Some(K(300)), None)))

	override def speedOfSound = Some(List((1310 * (m/s), Some(fromCelsius(27)), Some(MaterialState.Gas), None)))

	override def density = Some(List((0.08988 * (g/L), Some(kPa(101.325)), Some(fromCelsius(0)), None, None)))
	override def meltingPoint = Some((K(14.01), None))
	override def boilingPoint = Some((K(20.28), None))
	override def triplePoint = Some((K(13.8033), kPa(7.042)))
	override def criticalPoint = Some((K(32.97), MPa(1.293)))
	override def heatOfFusion = Some((0.117 * (kJ/mol), None, Some("H2")))
	override def heatOfVaporization = Some((0.904 * (kJ/mol), None, Some("H2")))
	override def specificHeatCapacity = Some(List((28.836 * (J/mol*K),Some(fromCelsius(25)), None, Some("H2"))))
}
