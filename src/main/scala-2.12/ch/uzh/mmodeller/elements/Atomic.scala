package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.MaterialState.MaterialState
import ch.uzh.utils.Units.{Ar, Density, ElectricResistivity, Energy, Length, MolarEnergy, MolarHeatCapacity, Pressure, Temperature, ThermalConductivity, ThermalExpansion, Velocity}

/**
  * Base class for all Chemical Elements
  * Each Chemical Element can be enhanced with Traits
  * All special attributes default to None, implement Some() explicitly
  * @param number atomic number
  * @param atomicWeight atomic weight
  */
abstract class Atomic(number: Int, atomicWeight: Ar) extends ChemicalElement {

  /**
    * Determine number of protons from atomic number
    * @return number of protons
    */
  def protons: Int = number
  /**
    * Determine number of neutrons from atomic number
    * @return number of neutrons
    */
  def neutrons: Int = atomicWeight.toInt - number
  /**
    * Determine number of electrons from atomic number
    * @return number of electrons
    */
  def electrons: Int = number

  /**
    * Getter for Atomic Weight
    * @return weight in Ar
    */
  def standardAtomicWeight: Ar = atomicWeight

  def oxidationStates: Option[List[Int]] = None
  def atomicRadius: Option[Length] = None
  def atomicRadiusCalc: Option[Length] = None
  def covalentRadius: Option[Length] = None

  def electricalResistivity: Option[(ElectricResistivity, Option[Temperature])] = None
  def vanDerWaalsRadius: Option[Length] = None
  def electronNegativity: Option[Double] = None
  def ionizationEnergies: Option[Map[String, MolarEnergy]] = None
  def thermalConductivity: Option[List[(ThermalConductivity, Option[Temperature], Option[String])]] = None
  def thermalExpansion: Option[(ThermalExpansion, Option[Temperature], Option[String])] = None
  def bandGapEnergy: Option[(Energy, Option[Temperature])] = None

  def density: Option[List[(Density, Option[Pressure], Option[Temperature], Option[String], Option[MaterialState])]] = None
  def liquidDensityNearMeltingPoint: Option[Density] = None

  def meltingPoint: Option[(Temperature, Option[Pressure])] = None
  def boilingPoint: Option[(Temperature, Option[Pressure])] = None
  def triplePoint: Option[(Temperature, Pressure)] = None
  def criticalPoint: Option[(Temperature, Pressure)] = None

  def heatOfFusion: Option[(MolarEnergy, Option[Pressure], Option[String])] = None
  def heatOfVaporization: Option[(MolarEnergy, Option[Pressure], Option[String])] = None
  def specificHeatCapacity: Option[List[(MolarHeatCapacity, Option[Temperature], Option[Pressure], Option[String])]] = None

  def speedOfSound: Option[Seq[(Velocity, Option[Temperature], Option[MaterialState], Option[String])]] = None

  def youngModulus: Option[List[(Pressure, Option[String])]] = None
  def shearModulus: Option[List[(Pressure, Option[String])]] = None
  def bulkModulus: Option[List[(Pressure, Option[String])]] = None
  def poissonRatio: Option[List[(Double, Option[String])]] = None
  def mohsHardness: Option[List[(Double, Option[String])]] = None
  def vickersHardness: Option[List[(Pressure, Option[String])]] = None
  def brinellHardness: Option[List[(Pressure, Option[String])]] = None
}
