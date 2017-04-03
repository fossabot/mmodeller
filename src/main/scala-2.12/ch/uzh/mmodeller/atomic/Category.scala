package ch.uzh.mmodeller.atomic

object Category extends Enumeration {
  type Category = Value
  val AlkaliMetals ,
      AlkalineEarthMetals,
      Pnictogens,
      Chalcogens,
      Halogens,
      NobleGases,
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
      TransplutoniumElements = Value
}
