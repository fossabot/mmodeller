package ch.uzh.mmodeller.atomic

import ch.uzh.mmodeller.atomic.Block.Block
import ch.uzh.mmodeller.atomic.Category.Category
import ch.uzh.utils.Units.Ar

import scala.collection.mutable.ListBuffer

trait GeneralProperties {

  def standardAtomicWeight: Ar
  def electronConfiguration: Option[String]
  def electronsPerShell: List[Int]

  def group(number: Int) : Option[String] = number match {
    case n if Seq(3, 11, 19, 37, 55, 87) contains n => Some("Group 1")
    case n if Seq(4, 12, 20, 38, 56, 88) contains n => Some("Group 2")
    case n if Seq(21, 39, 57, 89) contains n => Some("Group 3")
    case n if Seq(22, 40, 72, 104) contains n => Some("Group 4")
    case n if Seq(23, 41, 73, 105) contains n => Some("Group 5")
    case n if Seq(24, 42, 74, 106) contains n => Some("Group 6")
    case n if Seq(25, 43, 75, 107) contains n => Some("Group 7")
    case n if Seq(26, 44, 76, 108) contains n => Some("Group 8")
    case n if Seq(27, 45, 77, 109) contains n => Some("Group 9")
    case n if Seq(28, 46, 78, 110) contains n => Some("Group 10")
    case n if Seq(29, 47, 79, 111) contains n => Some("Group 11")
    case n if Seq(30, 48, 80, 112) contains n => Some("Group 12")
    case n if Seq(5, 13, 31, 49, 81, 113) contains n => Some("Group 13")
    case n if Seq(6, 14, 32, 50, 82, 114) contains n => Some("Group 14")
    case n if Seq(7, 15, 33, 51, 83, 115) contains n => Some("Group 15")
    case n if Seq(8, 16, 34, 52, 84, 116) contains n => Some("Group 16")
    case n if Seq(9, 17, 35, 53, 85) contains n => Some("Group 17")
    case n if Seq(2, 10, 18, 36, 54, 86) contains n => Some("Group 18")
    case _ => None
  }

  def period(number:Int) : Option[Int] = number match {
    case n if 1 until 2 contains n => Some(1)
    case n if 3 until 10 contains n => Some(2)
    case n if 11 until 18 contains n => Some(3)
    case n if 19 until 36 contains n => Some(4)
    case n if 37 until 54 contains n => Some(5)
    case n if 55 until 86 contains n => Some(6)
    case n if 87 until 118 contains n => Some(7)
    case _ => None
  }

  def block(number:Int, symbol: String): Block = {
    if (group(number).isDefined && (group(number).get == "Group 1" || group(number).get == "Group 2" || symbol == "He")) return Block.s
    if (group(number).isDefined && (3 until 12 contains group(number).get.split(" ").last.toInt)) return Block.d
    if ((58 until 71 contains number) || (90 until 103 contains number)) Block.f
    else Block.p
  }

  def categories(number: Int, symbol: String): List[Category] = {
    val result = new ListBuffer[Category]
    if (group(number).isDefined && group(number).get == "Group 1") result += Category.AlkaliMetals
    if (group(number).isDefined && group(number).get == "Group 2") result += Category.AlkalineEarthMetals
    if (group(number).isDefined && group(number).get == "Group 15") result += Category.Pnictogens
    if (group(number).isDefined && group(number).get == "Group 16") result += Category.Chalcogens
    if (group(number).isDefined && group(number).get == "Group 17") result += Category.Halogens
    if (group(number).isDefined && group(number).get == "Group 18") result += Category.NobleGases
    if (57 until 71 contains number) result += Category.Lanthanoids
    if (89 until 103 contains number) result += Category.Actinoids
    if ((57 until 71 contains number) || (number == 21) || (number == 39)) result += Category.RareEarthElements
    if (group(number).isDefined && (3 until 12 contains group(number).get.split(" ").last.toInt)) result += Category.TransitionMetals
    if (Seq("Al", "Ga", "In", "Tl", "Sn", "Pb", "Bi", "Po", "Fl", "Nh", "Mc") contains symbol) result += Category.PostTransitionMetals
    if (Seq("B", "Si", "Ge", "As", "Sb", "Te", "At") contains symbol) result += Category.Metalloids
    if (Seq("C", "P", "S", "Se") contains symbol) result += Category.PolyatomicNonmetals
    if (Seq("H", "N", "O", "F", "Cl", "Br", "I") contains symbol) result += Category.DiatomicNonmetals
    if (121 until 157 contains number) result += Category.Superactinides
    if (Seq("Cu", "Ag", "Au") contains symbol) result += Category.CoinageMetals
    if (Seq("Ru", "Rh", "Pd", "Os", "Ir", "Pt") contains symbol) result += Category.PlatinumGroup
    if (number > 92) result += Category.TransuraniumElements
    if (number > 103) result += Category.TransactinideElements
    if (number > 94) result += Category.TransplutoniumElements
    result.toList
  }
}
