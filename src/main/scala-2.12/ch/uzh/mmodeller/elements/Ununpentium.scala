package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}

object Ununpentium extends Atomic(115, 288.0) with ChemicalGroup {
  def symbol = "Uup"
  def category = Category.PostTransitionMetals
  def group = 15
  def period = 7
  def block = 'p'
  def appearance = "unknown"
  def electronConfiguration = "perhaps [Rn] 5f14 6d10 7s2 7p3 (...bismuth)"
  def electronsPerShell = List(2, 8, 18, 32, 32, 18, 5)
  def casNumber = "54085-64-2"
  def phase = MaterialState.Unknown
}
