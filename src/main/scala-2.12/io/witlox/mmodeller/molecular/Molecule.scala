package io.witlox.mmodeller.molecular

import io.witlox.mmodeller.MaterialState
import io.witlox.mmodeller.MaterialState.MaterialState
import io.witlox.mmodeller.dynamics.Space
import io.witlox.mmodeller.elements.{ChemicalElement, Symbols}
import io.witlox.mmodeller.utils.Units.{Pressure, Temperature}

case class Molecule(composite: String, space: Space) {

  require(atoms.values.sum > 1, "A molecule must contain 2 or more atoms")

  def atoms: Map[ChemicalElement, Int] = {
    def parse(c: => String, accumulator: Map[ChemicalElement, Int]): Map[ChemicalElement, Int] = c match {
      case s if s.isEmpty => accumulator
      case s =>
        def scan(ss: String, size: Int) = {
          val element = Symbols.all(ss.substring(0, size))
          val number = "\\d+".r findFirstIn ss
          if (number.isDefined && ss.indexOf(number.get) == size) {
            (element, number.get.toInt)
          } else {
            (element , 1)
          }
        }
        if (s.length >= 3 && Symbols.all.contains(s.substring(0, 3))) {
          val (e, n) = scan(s, 3)
          parse(s.substring(e.symbol.length + n.toString.length - 1), accumulator + (e -> n))
        } else if (s.length >= 2 && Symbols.all.contains(s.substring(0, 2))) {
          val (e, n) = scan(s, 2)
          parse(s.substring(e.symbol.length + n.toString.length - 1), accumulator + (e -> n))
        } else if (s.length >= 1 && Symbols.all.contains(s.substring(0, 1))) {
          val (e, n) = scan(s, 1)
          parse(s.substring(e.symbol.length + n.toString.length - 1), accumulator + (e -> n))
        } else {
          accumulator
        }
    }
    parse(composite, Map())
  }

//  def phase: MaterialState = {
//    def hasLowerState(t: Temperature, p: Option[Pressure]): Boolean = (t,p) match {
//      case _ if space.temperature > t  && p.isEmpty => false
//      case _ if space.temperature > t || space.pressure > p.get => false
//      case _ => true
//    }
//    def meltingPoint(t: Temperature, p: Option[Pressure]): MaterialState = {
//      if (space.temperature > t) {
//        if (hasLowerState(t, p)) {
//          MaterialState.Solid
//        } else {
//          MaterialState.Liquid
//        }
//      } else {
//        MaterialState.Solid
//      }
//    }
//    def boilingPoint(t: Temperature, p: Option[Pressure]): MaterialState = {
//      if (space.temperature > t) {
//        if (hasLowerState(t, p)) {
//          MaterialState.Liquid
//        } else {
//          MaterialState.Gas
//        }
//      } else {
//        MaterialState.Liquid
//      }
//    }
//    if (element.boilingPoint.isDefined && element.meltingPoint.isDefined) {
//      if (space.temperature > element.meltingPoint.get._1) {
//          boilingPoint(element.boilingPoint.get._1, element.boilingPoint.get._2)
//      } else {
//          meltingPoint(element.meltingPoint.get._1, element.meltingPoint.get._2)
//      }
//    } else if (element.boilingPoint.isDefined) {
//        boilingPoint(element.boilingPoint.get._1, element.boilingPoint.get._2)
//    } else if (element.meltingPoint.isDefined) {
//        meltingPoint(element.meltingPoint.get._1, element.meltingPoint.get._2)
//    } else {
//        element.phase
//    }
//  }

}
