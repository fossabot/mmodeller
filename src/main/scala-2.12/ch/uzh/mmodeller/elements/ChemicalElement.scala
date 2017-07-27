package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.Category.Category
import ch.uzh.mmodeller.Materials.MaterialState.MaterialState
import ch.uzh.utils.Units.{/, Ar, Area, MolarEnergy, Pressure, Temperature, Time}

/**
  * Base Traits for All Chemical Elements
  */
trait ChemicalElement {

  /**
    * A proton is a subatomic particle, symbol p or p+, with a positive electric charge
    * of +1e elementary charge and mass slightly less than that of a neutron.
    * Determine number of protons from atomic number
    * @return number of protons
    */
  def protons: Int
  /**
    * The neutron is a subatomic particle, symbol n or n0, with no net electric charge
    * and a mass slightly larger than that of a proton.
    * Determine number of neutrons from atomic number
    * @return number of neutrons
    */
  def neutrons: Int
  /**
    * The electron is a subatomic particle, symbol e− or β−, with a negative elementary
    * electric charge.
    * Determine number of electrons from atomic number
    * @return number of electrons
    */
  def electrons: Int

  /**
    * Atomic weight, also called relative atomic mass, ratio of the average mass
    * of a chemical element’s atoms to some standard
    * Getter for Atomic Weight
    * @return weight in Ar
    */
  def standardAtomicWeight: Ar
  /**
    * In relation to the chemical elements, a symbol is a code for a chemical element.
    * @return symbol as String
    */
  def symbol: String
  /**
    * Category of the Chemical Element
    * @return Category
    */
  def category: Category
  /**
    * A block of the periodic table of elements is a set of adjacent groups.
    * @return Character of the block
    */
  def block: Char
  /**
    * The way the stuff looks
    * @return wording of the appearance
    */
  def appearance: String
  /**
    * A CAS Registry Number, also referred to as CASRN or CAS Number, is a unique numerical identifier assigned
    * by Chemical Abstracts Service (CAS) to every chemical substance described in the open scientific
    * literature (currently including those described from at least 1957 through the present), including organic
    * and inorganic compounds, minerals, isotopes, alloys and nonstructurable materials (UVCBs, of unknown,
    * variable composition, or biological origin).
    * @return CAS
    */
  def casNumber: String

  /**
    * In atomic physics and quantum chemistry, the electron configuration is the distribution of electrons of an
    * atom or molecule (or other physical structure) in atomic or molecular orbitals.
    * @return configuration as text
    */
  def electronConfiguration: String
  /**
    * In chemistry and atomic physics, an electron shell, or a principal energy level, may be thought of as an orbit
    * followed by electrons around an atom's nucleus.
    * @return Sequence of the electrons
    */
  def electronsPerShell: Seq[Int]
  /**
    * Material State at room temperature
    * @return State
    */
  def phase: MaterialState
}

/**
  * Group and period of the Chemical Element (if any)
  */
trait ChemicalGroup {
  /**
    * In chemistry, a group (also known as a family) is a column of elements in the periodic table
    * of the chemical elements.
    * @return element group number
    */
  def group: Int
  /**
    * A period in the periodic table is one of the horizontal rows, all of whose elements have the
    * same number of electron shells.
    * @return element period number
    */
  def period: Int
}

/**
  * When a Chemical Element has no group/period it is still positioned on the periodic table
  */
trait Positional {
  /**
    * Column on the Periodic Table
    * @return column
    */
  def col: Int
  /**
    * Row on the Periodic Table
    * @return row
    */
  def row: Int
}

trait CrystalStructure {
  /**
    * In crystallography, crystal structure is a description of the ordered arrangement of atoms,
    * ions or molecules in a crystalline material.
    * @return structure as text
    */
  def crystalStructure: String
}

trait MagneticOrdering {
  /**
    * Magnetic ordering of the Chemical Element
    * @return ordering as text
    */
  def magneticOrdering: String
}

trait ElectronAffinity {
  /**
    * n chemistry and atomic physics, the electron affinity of an atom or molecule is defined as the amount
    * of energy released or spent when an electron is added to a neutral atom or molecule in the gaseous state
    * to form a negative ion.
    * @return amount of energy released
    */
  def electronAffinity: MolarEnergy
}

trait TensileStrain {
  /**
    * The relative elongation of a material when subjected to tension
    * @return strain
    */
  def tensileStrain: Double
}

trait TensileStrength {
  /**
    * Tensile strength is a measurement of the force required to pull something such as rope, wire, or a structural
    * beam to the point where it breaks
    * @return tensile strength as pressure
    */
  def tensileStrength: Pressure
}

trait ThermalDiffusivity {
  /**
    * In heat transfer analysis, thermal diffusivity is the thermal conductivity divided by density and specific
    * heat capacity at constant pressure.
    * @return diffusivity
    */
  def thermalDiffusivity: (Area/Time, Temperature)
}