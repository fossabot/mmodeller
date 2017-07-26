package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}

object Bohrium extends Atomic(107, 272.0) with ChemicalGroup {
  def symbol = "Bh"
  def category = Category.TransitionMetals
  def group = 7
  def period = 7
  def block = 'd'
  def appearance = "unknown, probably silvery white or metallic gray"
  def electronConfiguration = "[Rn] 5f14 6d5 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 32, 13, 2)
  def casNumber = "54037-14-8"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(7))
}
