package ch.uzh.mmodeller.Materials

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

object Category extends Enumeration {
    type Category = Value
    val AlkaliMetals ,
    AlkalineEarthMetals,
    Pnictogens,
    Chalcogens,
    Halogens,
    NobleGases,
    NonMetal,
    Lanthanoids,
    Actinoids,
    RareEarthElements,
    TransitionMetals,
    PostTransitionMetals,
    Metalloids,
    PolyatomicNonmetals,
    DiatomicNonmetals,
    Superactinides,
    CoinageMetals,
    PlatinumGroup,
    TransuraniumElements,
    TransactinideElements,
    TransplutoniumElements,
    Unknown = Value
}
