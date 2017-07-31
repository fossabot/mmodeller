package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}

object Hassium extends ChemicalElementBase(108, 270.0) with ChemicalGroup {
  def symbol = "Hs"
  def category = Category.TransitionMetals
  def group = 8
  def period = 7
  def block = 'd'
  def appearance = "unknown, probably silvery white or metallic gray"
  def electronConfiguration = "[Rn] 5f14 6d6 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 32, 14, 2)
  def casNumber = "54037-57-9"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(8))
}
