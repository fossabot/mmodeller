package io.witlox.mmodeller.elements

import io.witlox.mmodeller.{Category, MaterialState}

object Ununtrium extends ChemicalElementBase(113, 284.0) with ChemicalGroup {
  def symbol = "Uut"
  def category = Category.PostTransitionMetals
  def group = 13
  def period = 7
  def block = 'p'
  def appearance = "possibly light or dark element"
  def electronConfiguration = "perhaps [Rn] 5f14 6d10 7s2 7p1 (...thallium)"
  def electronsPerShell = List(2, 8, 18, 32, 32, 18, 3)
  def casNumber = "54084-70-7"
  def phase = MaterialState.Solid
}
