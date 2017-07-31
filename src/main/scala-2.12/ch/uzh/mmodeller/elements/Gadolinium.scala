package ch.uzh.mmodeller.elements

import ch.uzh.mmodeller.Materials.{Category, MaterialState}
import ch.uzh.utils.units.Energy.{J, W, kJ, uOhm}
import ch.uzh.utils.units.Length.{m, pm, um}
import ch.uzh.utils.units.Mass.g
import ch.uzh.utils.units.Chemical.mol
import ch.uzh.utils.units.Volume.cm3
import ch.uzh.utils.units.Time.s
import ch.uzh.utils.units.Pressure.{GPa, MPa}
import ch.uzh.utils.units.Temperature.{K, fromCelsius}

object Gadolinium extends ChemicalElementBase(64, 157.25) with Positional with CrystalStructure with MagneticOrdering  {
  def symbol = "Gd"
  def category = Category.Lanthanoids
  def col = 8
  def row = 1
  def block = 'f'
  def appearance = "silvery white"
  def electronConfiguration = "[Xe] 4f7 5d1 6s2"
  def electronsPerShell = List(2, 8, 18, 25, 9, 2)
  def crystalStructure = "hexagonal"
  def magneticOrdering = "ferromagnetic/paramagnetic, transition at K(292)"
  def casNumber = "7440-54-2"
  def phase = MaterialState.Solid

  override def oxidationStates = Some(List(3))
  override def electronNegativity = Some(1.20)
  override def ionizationEnergies = Some(Map("1st" -> 593.4 * (kJ/mol), "2nd" -> 1170 * (kJ/mol), "3rd" -> 1990 * (kJ/mol)))
  override def atomicRadius = Some(pm(180))
  override def atomicRadiusCalc = Some(pm(233))
  override def electricalResistivity = Some((1.310 * uOhm*m, None))
  override def thermalConductivity = Some(List((10.6 * (W/m*K), Some(K(300)), None)))
  override def thermalExpansion = Some((9.4 * (um/m*K), Some(fromCelsius(100)), Some("α")))

  override def speedOfSound = Some(List((2680 * (m/s), Some(fromCelsius(20)), None, None)))
  override def youngModulus = Some(List((GPa(54.8), Some("α"))))
  override def shearModulus = Some(List((GPa(21.8), Some("α"))))
  override def bulkModulus = Some(List((GPa(37.9), Some("α"))))
  override def poissonRatio = Some(List((0.259, Some("α"))))
  override def vickersHardness = Some(List((MPa(570), None)))

  override def density = Some(List((7.90 * (g/cm3), None, None, None, Some(MaterialState.Solid)), (7.4 * (g/cm3), None, None, None, Some(MaterialState.Liquid))))
  override def meltingPoint = Some((K(1585), None))
  override def boilingPoint = Some((K(3546), None))
  override def heatOfFusion = Some((10.05 * (kJ/mol), None, None))
  override def heatOfVaporization = Some((301.3 * (kJ/mol), None, None))
  override def specificHeatCapacity = Some(List((37.03 * (J/mol*K), Some(fromCelsius(25)), None,None)))
}
