package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}

object Darmstadtium extends ChemicalElementBase(110, 281.0) with ChemicalGroup {
  def symbol = "Ds"
  def category = Category.TransitionMetals
  def group = 10
  def period = 7
  def block = 'd'
  def appearance = "probably light silver green metallic"
  def electronConfiguration = "perhaps [Rn] 5f14 6d9 7s1 (...platinum)"
  def electronsPerShell = List(2, 8, 18, 32, 32, 17, 1)
  def casNumber = "54083-77-1"
  def phase = MaterialState.Solid
}
