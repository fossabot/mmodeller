package io.witlox.mmodeller.chemical

import io.witlox.mmodeller.dynamics.Space
import io.witlox.mmodeller.elements._
import io.witlox.mmodeller.molecular.Molecule

case class Compound(composite: String, space: Space) {

  require(elements.length > 1, "Compound must contain 2 or more atoms")

  def oxidationState: Int = {

  }

  def elements: List[Molecule] = {
    def parse(c: => String, accumulator: List[Molecule]): List[Molecule] = c match {
      case s if s.isEmpty => accumulator
      case s =>
        def scan(ss: String, size: Int) = {
          val element = Symbols.all(ss.substring(0, size))
          val number = "\\d+".r findFirstIn ss
          if (number.isDefined && ss.indexOf(number.get) == size) {
            parse(ss.substring(size + number.get.length), accumulator.::(Molecule(element, number.get.toInt, space)))
          } else {
            parse(ss.substring(size), accumulator.::(Molecule(element, 1, space)))
          }
        }
        if (s.length >= 1 && Symbols.all.contains(s.substring(0, 1))) {
          scan(s, 1)
        } else if (s.length >= 2 && Symbols.all.contains(s.substring(0, 2))) {
          scan(s, 2)
        } else if (s.length >= 3 && Symbols.all.contains(s.substring(0, 3))) {
          scan(s, 3)
        } else {
          accumulator
        }
    }
    parse(composite, List())
  }

}

