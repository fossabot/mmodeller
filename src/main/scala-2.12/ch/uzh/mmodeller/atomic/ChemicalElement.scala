package ch.uzh.mmodeller.atomic

import ch.uzh.mmodeller.MaterialState
import ch.uzh.mmodeller.MaterialState.MaterialState
import ch.uzh.utils.UnitParser
import ch.uzh.utils.Units.{Density, Temperature}
import ch.uzh.utils.units.Temperature._
import ch.uzh.utils.Units._

import scala.collection.mutable

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

  private val findBrackets = "\\([^)]*\\)"

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

  override def densities = {
    val densitiesMap = physicalParameters.filterKeys(k => k.toLowerCase.contains("density"))
    var result = new mutable.MutableList[(Option[String], Temperature, Density, Option[MaterialState])]
    for (desc <- densitiesMap.keys) {
      val value = densitiesMap.get(desc)
      desc match {
        case p if p.toLowerCase == "density" => {
          for (line <- value) {
              //result += ()
          }
        }
      }
    }
    result.toList
  }

  override def liquidDensityNearMeltingPoint = ???

  private def extractTemperature(mp: List[String]) = {
    val regexT = """(\d+)\s*K""".r
    val grouped = regexT findAllIn mp.head.replaceAll(findBrackets, "")
    if (grouped.nonEmpty) {
      Some(K(grouped.next().replaceAll("K", "").trim.toDouble))
    } else {
      None
    }
  }

  override def meltingPoint: Option[Temperature] = physicalParameters.get("Melting point") match {
    case Some(mp) => extractTemperature(mp)
    case None => None
  }

  override def boilingPoint: Option[Temperature] = physicalParameters.get("Boiling point") match {
    case Some(bp) => extractTemperature(bp)
    case None => None
  }

  override def triplePoint: Option[(Temperature, Pressure)] = physicalParameters.get("Triple point") match {
    case Some(tp) => None
//      val r = UnitParser.parse(tp.head.replaceAll(findBrackets, ""), ",")
//      val t = r.filter(e => e._1.isInstanceOf[Temperature]).head._2.asInstanceOf[Temperature]
//      val p = r.filter(e => e._1.isInstanceOf[Pressure]).head._2.asInstanceOf[Pressure]
//      Some(t,p)
    case None => None
  }

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
