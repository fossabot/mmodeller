package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}

object Ununhexium extends ChemicalElementBase(116, 293.0) with ChemicalGroup {
  def symbol = "Uuh"
  def category = Category.PostTransitionMetals
  def group = 16
  def period = 7
  def block = 'p'
  def appearance = "unknown"
  def electronConfiguration = "perhaps [Rn] 5f14 6d10 7s2 7p4 (...polonium)"
  def electronsPerShell = List(2, 8, 18, 32, 32, 18, 6)
  def casNumber = "54100-71-9"
  def phase = MaterialState.Unknown
}
