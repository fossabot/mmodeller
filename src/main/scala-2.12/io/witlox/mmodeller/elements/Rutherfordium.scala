package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}

object Rutherfordium extends ChemicalElementBase(104, 267.0) with ChemicalGroup {
  def symbol = "Rf"
  def category = Category.TransitionMetals
  def group = 4
  def period = 7
  def block = 'd'
  def appearance = "unknown, probably silvery white or metallic gray"
  def electronConfiguration = "[Rn] 5f14 6d2 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 32, 10, 2)
  def casNumber = "53850-36-5"
  def phase = MaterialState.Unknown

  override def oxidationStates = Some(List(4))
}
