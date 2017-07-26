package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.kJ
import ch.uzh.utils.units.Chemical.mol

object Nobelium extends Atomic(102, 259.0) with Positional {
  def symbol = "No"
  def category = Category.Actinoids
  def col = 14
  def row = 2
  def block = 'f'
  def appearance = "unknown, probably metallic"
  def electronConfiguration = "[Rn] 5f14 7s2"
  def electronsPerShell = List(2, 8, 18, 32, 32, 8, 2)
  def casNumber = "10028-14-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(2, 3))
  override def ionizationEnergies = Some(Map("1st" -> 641.6* (kJ/mol), "2nd" -> 1254.3* (kJ/mol), "3rd" -> 2605.1* (kJ/mol)))
}
