package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}

object Meitnerium extends Atomic(109, 276.0) with ChemicalGroup {
  def symbol = "Mt"
  def category = Category.TransitionMetals
  def group = 9
  def period = 7
  def block = 'd'
  def appearance = "probably light silver green metallic"
  def electronConfiguration = "perhaps [Rn] 5f14 6d7 7s2 (...iridium)"
  def electronsPerShell = List(2, 8, 18, 32, 32, 15, 2)
  def casNumber = "54038-01-6"
  def phase = MaterialState.Solid
}
