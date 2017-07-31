package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}

object Seaborgium extends ChemicalElementBase(106, 271.0) with ChemicalGroup {
  def symbol = "Sg"
  def category = Category.TransitionMetals
  def group = 6
  def period = 7
  def block = 'd'
  def appearance = "unknown, probably silvery white or metallic gray"
  def electronConfiguration = "[Rn] 7s2 5f14 6d4"
  def electronsPerShell = List(2, 8, 18, 32, 32, 12, 2)
  def casNumber = "54038-81-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(6))
}
