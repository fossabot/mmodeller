package io.witlox.mmodeller.elements

import io.witlox.mmodeller.MaterialState.MaterialState
import io.witlox.mmodeller.utils.Units.{Ar, Density, ElectricResistivity, Energy, Length, MolarEnergy, MolarHeatCapacity, Pressure}
import io.witlox.mmodeller.utils.Units.{Temperature, ThermalConductivity, ThermalExpansion, Velocity}

/**
  * Base class for all Chemical Elements
  * Each Chemical Element has a base Trait of [[ChemicalElement]] and can be enhanced with
  * the following Traits: [[ChemicalGroup]], [[Positional]], [[CrystalStructure]], [[MagneticOrdering]],
  * [[ElectronAffinity]], [[TensileStrain]], [[TensileStrength]] and [[ThermalDiffusivity]].
  * All special attributes default to None, implement Some() explicitly
  * @param number atomic number
  * @param atomicWeight atomic weight
  */
abstract class ChemicalElementBase(number: Int, atomicWeight: Ar) extends ChemicalElement {

  /**
    * A proton is a subatomic particle, symbol p or p+, with a positive electric charge
    * of +1e elementary charge and mass slightly less than that of a neutron.
    * Determine number of protons from atomic number
    * @return number of protons
    */
  def protons: Int = number
  /**
    * The neutron is a subatomic particle, symbol n or n0, with no net electric charge
    * and a mass slightly larger than that of a proton.
    * Determine number of neutrons from atomic number
    * @return number of neutrons
    */
  def neutrons: Int = atomicWeight.toInt - number
  /**
    * The electron is a subatomic particle, symbol e− or β−, with a negative elementary
    * electric charge.
    * Determine number of electrons from atomic number
    * @return number of electrons
    */
  def electrons: Int = number

  /**
    * Atomic weight, also called relative atomic mass, ratio of the average mass
    * of a chemical element’s atoms to some standard
    * Getter for Atomic Weight
    * @return weight in Ar
    */
  def standardAtomicWeight: Ar = atomicWeight

  /**
    * @return Initial oxidation state of the Atom (0)
    */
  def initialOxidationState: Int = 0

  /**
    * Oxidation states simplify the whole process of working out what is being oxidised
    * and what is being reduced in redox reactions.
    * @return Optional list of Oxidation States
    */
  def oxidationStates: Option[List[Int]] = None

  /**
    * The atomic radius of a chemical element is a measure of the size of its atoms,
    * usually the mean or typical distance from the center of the nucleus to the boundary
    * of the surrounding cloud of electrons.
    * @return Optional Length of the Atomic Radius
    */
  def atomicRadius: Option[Length] = None
  /**
    * Atomic Radius computed from a theoretical model.
    * @return Optional Calculated atomic radius
    */
  def atomicRadiusCalc: Option[Length] = None
  /**
    * The covalent radius, rcov, is a measure of the size of an atom that forms part of one covalent bond.
    * @return Optional Covalent Radius
    */
  def covalentRadius: Option[Length] = None

  /**
    *Electrical resistivity (also known as resistivity, specific electrical resistance, or volume resistivity)
    * is an intrinsic property that quantifies how strongly a given material opposes the flow of electric current.
    * @return Optional Tuple of Electrical Resistivity, with an optional Registered Temperature
    */
  def electricalResistivity: Option[(ElectricResistivity, Option[Temperature])] = None
  /**
    * The van der Waals radius, rw, of an atom is the radius of an imaginary hard sphere representing the distance
    * of closest approach for another atom.
    * @return Optional Length of the Radius
    */
  def vanDerWaalsRadius: Option[Length] = None
  /**
    * Electron negativity is a measure of the tendency of an atom to attract a bonding pair of electrons.
    * @return Optional value of Electron Negativity (Pauling Scale)
    */
  def electronNegativity: Option[Double] = None
  /**
    * The ionization energy (IE) is qualitatively defined as the amount of energy required to remove the most
    * loosely bound electron, the valence electron, of an isolated gaseous atom to form a cation.
    * @return Optional Map of the level with corresponding molar energy
    */
  def ionizationEnergies: Option[Map[String, MolarEnergy]] = None
  /**
    * Thermal conductivity (often denoted k, λ, or κ) is the property of a material to conduct heat.
    * @return Optional List of tuples, each tuple containing the Thermal Conductivity at an Optional Temperature with
    *         and Optional type
    */
  def thermalConductivity: Option[List[(ThermalConductivity, Option[Temperature], Option[String])]] = None
  /**
    * Thermal expansion is the tendency of matter to change in shape, area, and volume in response to a change
    * in temperature.
    * @return Optional Tuple of the Thermal Expansion at an Optional Temperature with an Optional Type (like 'diamond' for Carbon)
    */
  def thermalExpansion: Option[(ThermalExpansion, Option[Temperature], Option[String])] = None
  /**
    * In solid-state physics, a band gap, also called an energy gap or bandgap, is an energy range in a
    * solid where no electron states can exist.
    * @return Optional BandGap for Energy at a Temperature with an optional Type (like 'diamond' for Carbon)
    */
  def bandGapEnergy: Option[(Energy, Temperature, Option[String])] = None


  /**
    * Density of the Chemical Element
    * @return Optional List of densities with density under Optional Pressure and Optional Pressure for an Optional Type
    *         given an Optional MaterialState (ex. density of Tellurium when a Solid)
    */
  def density: Option[List[(Density, Option[Pressure], Option[Temperature], Option[String], Option[MaterialState])]] = None

  /**
    * The melting point (or, rarely, liquefaction point) of a solid is the temperature at which it changes state
    * from solid to liquid at atmospheric (or given) pressure.
    * @return Optional Temperature with Optional Pressure (None=1atm)
    */
  def meltingPoint: Option[(Temperature, Option[Pressure])] = None
  /**
    * The boiling point of a substance is the temperature at which the vapor pressure of the liquid equals the
    * pressure surrounding the liquid and the liquid changes into a vapor.
    * @return Optional Temperature with Optional Pressure (None=Surrounding Pressure)
    */
  def boilingPoint: Option[(Temperature, Option[Pressure])] = None
  /**
    * In thermodynamics, the triple point of a substance is the temperature and pressure at which the three phases
    * (gas, liquid, and solid) of that substance coexist in thermodynamic equilibrium.
    * @return Optional Temperature with a given Pressure
    */
  def triplePoint: Option[(Temperature, Pressure)] = None
  /**
    * In thermodynamics, a critical point (or critical state) is the end point of a phase equilibrium curve.
    * @return Optional Temperature with a given Pressure
    */
  def criticalPoint: Option[(Temperature, Pressure)] = None

  /**
    * The enthalpy of fusion of a substance, also known as (latent) heat of fusion, is the change in its enthalpy
    * resulting from providing energy, typically heat, to a specific quantity of the substance to change its state
    * from a solid to a liquid at constant pressure.
    * @return Optional MolarEnergy with an Optional Pressure and an Optional Type (like 'diamond' for Carbon)
    */
  def heatOfFusion: Option[(MolarEnergy, Option[Pressure], Option[String])] = None
  /**
    * The enthalpy of vaporization, (symbol ∆Hvap) also known as the (latent) heat of vaporization or heat of
    * evaporation, is the amount of energy (enthalpy) that must be added to the liquid substance, to transform
    * a quantity of that substance into a gas.
    * @return Optional MolarEnergy with an Optional Pressure and an Optional Type (like 'diamond' for Carbon)
    */
  def heatOfVaporization: Option[(MolarEnergy, Option[Pressure], Option[String])] = None
  /**
    * Heat capacity or thermal capacity is a measurable physical quantity equal to the ratio of the heat added
    * to (or removed from) an object to the resulting temperature change.
    * @return Optional List of MolarHeatCapacity at an Optional Temperature and Optional Pressure for a given Type
    */
  def specificHeatCapacity: Option[List[(MolarHeatCapacity, Option[Temperature], Option[Pressure], Option[String])]] = None

  /**
    * Speed at which sound passes through the Material
    * @return Optional List of Velocity at an Optional Temperature for an Optional MaterialState for an Optional Type
    *         (ex. 330 * (m/s), at 27 celsius, Gas, None : Oxygen)
    */
  def speedOfSound: Option[List[(Velocity, Option[Temperature], Option[MaterialState], Option[String])]] = None

  /**
    * Young's modulus, also known as the elastic modulus, is a measure of the stiffness of a solid material.
    * @return Optional List of Pressure with an Optional Type
    */
  def youngModulus: Option[List[(Pressure, Option[String])]] = None
  /**
    * In materials science, shear modulus or modulus of rigidity, denoted by G, or sometimes S or μ, is defined as
    * the ratio of shear stress to the shear strain.
    * @return Optional List of Pressure with an Optional Type
    */
  def shearModulus: Option[List[(Pressure, Option[String])]] = None
  /**
    * The bulk elastic properties of a material determine how much it will compress under a given amount of
    * external pressure.
    * @return Optional List of Pressure with an Optional Type
    */
  def bulkModulus: Option[List[(Pressure, Option[String])]] = None
  /**
    * Poisson's ratio, denoted {\displaystyle \nu } \nu  (nu) and named after Siméon Poisson, is the
    * signed ratio of transverse strain to axial strain.
    * @return Optional List of Double with an Optional Type
    */
  def poissonRatio: Option[List[(Double, Option[String])]] = None
  /**
    * The Mohs scale of mineral hardness is a qualitative ordinal scale characterizing scratch resistance of
    * various minerals through the ability of harder material to scratch softer material.
    * @return Optional List of Double with an Optional Type
    */
  def mohsHardness: Option[List[(Double, Option[String])]] = None
  /**
    * The Vickers hardness test was developed in 1921 by Robert L. Smith and George E. Sandland at Vickers Ltd as an
    * alternative to the Brinell method to measure the hardness of materials.
    * @return Optional List of Pressure with an Optional Type
    */
  def vickersHardness: Option[List[(Pressure, Option[String])]] = None
  /**
    * The Brinell scale characterizes the indentation hardness of materials through the scale of penetration
    * of an indenter, loaded on a material test-piece.
    * @return Optional List of Pressure with an Optional Type
    */
  def brinellHardness: Option[List[(Pressure, Option[String])]] = None
}
