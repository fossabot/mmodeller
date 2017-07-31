package ch.uzh.mmodeller.bonding

/**
  * A bonding where electrons are shared equally (roughly) amongst molecules
  * For many molecules, the sharing of electrons allows each atom to attain
  * the equivalent of a full outer shell, corresponding to a stable electronic
  * configuration.
  */
trait CovalentBond extends ChemicalBond {
  /**
    * In chemistry, an electron pair or a Lewis pair consists of two electrons that
    * occupy the same orbital but have opposite spins.
    * @return the amount of shared electrons
    */
  def electronPairs: Int
}
