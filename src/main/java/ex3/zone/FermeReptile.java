package ex3.zone;

/**
 * Classe qui contient les animaux situés en zone reptilienne
 *
 */
public class FermeReptile extends Zone {

	public FermeReptile() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimaux.size() * 0.1;
	}

}
