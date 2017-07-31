package ch.uzh.mmodeller.molecular

import ch.uzh.mmodeller.Materials.MaterialState
import ch.uzh.mmodeller.Materials.MaterialState.MaterialState
import ch.uzh.mmodeller.dynamics.Space
import ch.uzh.mmodeller.elements.ChemicalElementBase
import ch.uzh.utils.Units.{Pressure, Temperature}

case class Molecule(element: ChemicalElementBase, amount: Int, space: Space) {

  require(amount > 1, "A molecule must contain 2 or more atoms")

  def phase: MaterialState = {
    def hasLowerState(t: Temperature, p: Option[Pressure]): Boolean = (t,p) match {
      case _ if space.temperature > t  && p.isEmpty => false
      case _ if space.temperature > t || space.pressure > p.get => false
      case _ => true
    }
    def meltingPoint(t: Temperature, p: Option[Pressure]): MaterialState = {
      if (space.temperature > t) {
        if (hasLowerState(t, p)) {
          MaterialState.Solid
        } else {
          MaterialState.Liquid
        }
      } else {
        MaterialState.Solid
      }
    }
    def boilingPoint(t: Temperature, p: Option[Pressure]): MaterialState = {
      if (space.temperature > t) {
        if (hasLowerState(t, p)) {
          MaterialState.Liquid
        } else {
          MaterialState.Gas
        }
      } else {
        MaterialState.Liquid
      }
    }
    if (element.boilingPoint.isDefined && element.meltingPoint.isDefined) {
      if (space.temperature > element.meltingPoint.get._1) {
          boilingPoint(element.boilingPoint.get._1, element.boilingPoint.get._2)
      } else {
          meltingPoint(element.meltingPoint.get._1, element.meltingPoint.get._2)
      }
    } else if (element.boilingPoint.isDefined) {
        boilingPoint(element.boilingPoint.get._1, element.boilingPoint.get._2)
    } else if (element.meltingPoint.isDefined) {
        meltingPoint(element.meltingPoint.get._1, element.meltingPoint.get._2)
    } else {
        element.phase
    }
  }

}
