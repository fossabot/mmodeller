package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Energy.kJ

object Lawrencium extends Atomic(103, 262.0) with Positional {
  def symbol = "Lr"
  def category = Category.Actinoids
  def col = 15
  def row = 2
  def block = 'd'
  def appearance = "unknown, probably silvery white or metallic gray"
  def electronConfiguration = "[Rn] 5f14 7s2 7p1"
  def electronsPerShell = List(2, 8, 18, 32, 32, 8, 3)
  def casNumber = "22537-19-5"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def ionizationEnergies = Some(Map("1st" -> 443.8* (kJ/mol), "2nd" -> 1428.0* (kJ/mol), "3rd" -> 2219.1* (kJ/mol)))
}