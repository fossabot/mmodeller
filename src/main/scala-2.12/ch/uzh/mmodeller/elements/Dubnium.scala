package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}

object Dubnium extends ChemicalElementBase(105, 268.0) with ChemicalGroup {
  def symbol = "Db"
  def category = Category.TransitionMetals
  def group = 5
  def period = 7
  def block = 'd'
  def appearance = "unknown, probably silvery white or metallic gray"
  def electronConfiguration = "[Rn] 5f14 6d3 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 32, 11, 2)
  def casNumber = "53850-35-4"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(5))
}
