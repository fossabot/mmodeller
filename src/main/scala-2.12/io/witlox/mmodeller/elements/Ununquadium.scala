package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}

object Ununquadium extends ChemicalElementBase(114, 289.0) with ChemicalGroup {
  def symbol = "Uuq"
  def category = Category.PostTransitionMetals
  def group = 14
  def period = 7
  def block = 'p'
  def appearance = "unknown, probably silvery white or metallic gray"
  def electronConfiguration = "perhaps [Rn] 5f14 6d10 7s2 7p2 (...lead)"
  def electronsPerShell = List(2, 8, 18, 32, 32, 18, 4)
  def casNumber = "54085-16-4"
  def phase = MaterialState.Unknown
}
