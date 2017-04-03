package ch.uzh.mmodeller.atomic

import ch.uzh.mmodeller.MaterialState.MaterialState
import ch.uzh.utils.Units.{Density, MolarEnergy, MolarHeatCapacity, Pressure, Temperature}


trait PhysicalProperties {

  def densities: List[(Option[String], Temperature, Density, Option[MaterialState])]
  def liquidDensityNearMeltingPoint: Option[Density]
  def meltingPoint: Option[Temperature]
  def boilingPoint: Option[Temperature]
  def triplePoint: Option[(Temperature, Pressure)]
  def criticalPoint: Option[(Temperature, Pressure)]
  def heatOfFusion: Option[MolarEnergy]
  def heatOfVaporization: Option[MolarEnergy]
  def molarHeatCapacity: Option[MolarHeatCapacity]

}
