package javaauf4;

public class Rechnungen {
	// Die überladene Methode quadrat() berechnet Qudrat eines Zahles
	
	//Die überladene Methode quadrat() für Double 
	public static double quadrat (double zahl){
	double quadrat = zahl * zahl;
	return quadrat;
	}
	
	//Die überladene Methode quadrat() für Integer
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
