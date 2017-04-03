package ch.uzh.mmodeller.atomic

import ch.uzh.mmodeller.MaterialState
import ch.uzh.mmodeller.MaterialState.MaterialState
import ch.uzh.utils.Units.{Density, Temperature}

import scala.collection.mutable

import ch.uzh.utils.Units._


case class ChemicalElementException(message:String)  extends Exception

class ChemicalElement(name: String,
                      symbol: String,
                      number: Int,
                      atomicWeight: Ar,
                      electronDistribution: String,
                      generalParameters: Map[String, String],
                      physicalParameters: Map[String, List[String]],
                      atomicParameters: Map[String, String],
                      miscParameters: Map[String, String]
                     ) extends Atom(number, atomicWeight) with GeneralProperties {

  // General Atomic Properties
  override def standardAtomicWeight = atomicWeight
  override def electronConfiguration = generalParameters.get("Electron configuration")
  override def electronsPerShell = generalParameters.get("Electrons per shell") match {
    case Some(eps) => eps.split(",").map(_.trim.toInt).toList
    case None => List[Int]()
  }

  // Physical Atomic Properties
  private val phase = physicalParameters.get("Phase") match {
    case Some(phase) => phase.head.toLowerCase match {
      case "gas" => MaterialState.Gas
      case "solid" => MaterialState.Solid
      case "liquid" => MaterialState.Liquid
      case _ => MaterialState.Unknown
    }
    case None => MaterialState.Unknown
  }

  override def densities = ???
//  {
//    val densitiesMap = physicalParameters.filterKeys(k => k.toLowerCase.contains("density"))
//    var result = new mutable.MutableList[(Option[String], Temperature, Density, Option[MaterialState])]
//    for (desc <- densitiesMap.keys) {
//      val value = densitiesMap.get(desc)
//      desc match {
//        case p if p.toLowerCase == "density" => {
//          for (line <- value) {
//              result += ()
//          }
//        }
//      }
//    }
//    result.toList
//  }

  override def liquidDensityNearMeltingPoint = ???

  private val regexMp = "^bar(.*)baz$".r
  override def meltingPoint = ???
//  physicalParameters.get("Melting point") match {
//    case Some(mp) => (mp.collect{ case regexMp(v) => v.trim }.head.toDouble).to[K]
//    case None => None
//  }

  override def boilingPoint = ???
  override def triplePoint = ???
  override def criticalPoint = ???
  override def heatOfFusion = ???
  override def heatOfVaporization = ???
  override def molarHeatCapacity = ???

  // Specific Atomic properties
  override def oxidationStates = ???
  override def electronNegativity = ???
  override def ionizationEnergies = ???
  override def atomicRadius = ???
  override def atomicRaduisCalc = ???
  override def covalentRadius = ???
  override def vanDerWaalsRadius = ???

}
