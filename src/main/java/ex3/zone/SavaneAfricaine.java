package ex3.zone;

/**
 *
 */
public class SavaneAfricaine extends Zone {

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimaux.size() * 10;
	}

}
