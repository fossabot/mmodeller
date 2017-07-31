package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}

object Ununseptium extends ChemicalElementBase(117, 294.0) with ChemicalGroup {
  def symbol = "Uus"
  def category = Category.Unknown
  def group = 17
  def period = 7
  def block = 'p'
  def appearance = "Unknown"
  def electronConfiguration = "Unknown"
  def electronsPerShell = List(2,8,18,32,32,18,7)
  def casNumber = "87658-56-8"
  def phase = MaterialState.Unknown
}
