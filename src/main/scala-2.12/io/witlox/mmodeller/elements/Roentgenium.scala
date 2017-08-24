package io.witlox.mmodeller.elements

import io.witlox.mmodeller.Materials.{Category, MaterialState}

object Roentgenium extends ChemicalElementBase(111, 280.0) with ChemicalGroup {
  def symbol = "Rg"
  def category = Category.TransitionMetals
  def group = 11
  def period = 7
  def block = 'd'
  def appearance = "unknown"
  def electronConfiguration = "predicted [Rn] 5f14 6d9 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 32, 17, 2)
  def casNumber = "54386-24-2"
  def phase = MaterialState.Solid
}
