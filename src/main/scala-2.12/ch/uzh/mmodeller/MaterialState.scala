package ch.uzh.mmodeller

object MaterialState extends Enumeration {
  type MaterialState = Value
  val Solid,
      Liquid,
      Gas,
      Plasma,
      Glass,
      CrystalsWithSomeDegreeOfDisorder,
      LiquidCrystalStates,
      MagneticallyOrdered,
      MicrophaseSeparated,
      Superfluid,
      BoseEinsteinCondensate,
      FermionicCondensate,
      RydbergMolecule,
      QuantumHallState,
      PhotonicMatter,
      Dropleton,
      DegenerateMatter,
      QuarkMatter,
      ColorGlassCondensate,
      Supersolid,
      StringNetLiquid,
      Superglass,
      DarkMatter,
      Unknown = Value
}
