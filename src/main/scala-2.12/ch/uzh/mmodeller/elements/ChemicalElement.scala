package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.Category.Category
import ch.uzh.mmodeller.Materials.MaterialState.MaterialState
import ch.uzh.utils.Units.{/, Ar, Area, Pressure, Temperature, Time}

trait ChemicalElement {

  def standardAtomicWeight: Ar
  def symbol: String
  def category: Category
  def block: Char
  def appearance: String
  def casNumber: String

  def electronConfiguration: String
  def electronsPerShell: Seq[Int]
  def phase: MaterialState
}

trait ChemicalGroup {
  def group: Int
  def period: Int
}

trait Positional {
  def col: Int
  def row: Int
}

trait CrystalStructure {
  def crystalStructure: String
}

trait MagneticOrdering {
  def magneticOrdering: String
}

trait TensileStrain {
  def tensileStrain: Double
}

trait TensileStrength {
  def tensileStrength: Pressure
}

trait ThermalDiffusivity {
  def thermalDiffusivity: (Area/Time, Temperature)
}