package javaauf4;

public class Rechnungen {
	// Die �berladene Methode quadrat() berechnet Qudrat eines Zahles
	
	//Die �berladene Methode quadrat() f�r Double 
	public static double quadrat (double zahl){
	double quadrat = zahl * zahl;
	return quadrat;
	}
	
	//Die �berladene Methode quadrat() f�r Integer
	public static int quadrat (int zahl){
	int quadrat = zahl * zahl;
	return quadrat;
	}

	//Die Methode wurzel() berechnet quadrat Wurzel eine Zahles
	public static double wurzel (double zahl){
		double wurzel = Math.sqrt(zahl);
		return wurzel;
	}


}
