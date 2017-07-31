package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}

object Copernicium extends ChemicalElementBase(112, 285.0) with ChemicalGroup {
  def symbol = "Cn"
  def category = Category.TransitionMetals
  def group = 12
  def period = 7
  def block = 'd'
  def appearance = "unknown, probably silvery white..."
  def electronConfiguration = "[Rn] 5f14 6d10 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 32, 18, 2)
  def casNumber = "54084-26-3"
  def phase = MaterialState.Unknown

  override def oxidationStates = Some(List(4, 2))
}
