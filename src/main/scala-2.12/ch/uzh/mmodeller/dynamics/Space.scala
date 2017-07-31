package ch.uzh.mmodeller.dynamics

import ch.uzh.utils.Units.{Pressure, Temperature}

class Space(initialTemperature: Temperature, initialPressure: Pressure) {

  var spaceTemperature: Temperature = initialTemperature
  var spacePressure: Pressure = initialPressure

  def changeTemperature(delta: Temperature) = {
    spaceTemperature += delta
  }
  def changePressure(delta: Pressure) = {
    spacePressure += delta
  }

  def temperature: Temperature = spaceTemperature
  def pressure: Pressure = spacePressure
}
