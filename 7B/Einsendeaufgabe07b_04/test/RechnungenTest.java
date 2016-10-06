package test;

import javaauf4.Rechnungen;

public class RechnungenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double zahl1 = 5; 
		int zahl2 = 5;
		System.out.println("Double Quadrat ist " + Rechnungen.quadrat(zahl1));	
		System.out.println("Int Quadrat ist " + Rechnungen.quadrat(zahl2));
		System.out.println("Wurzel ist " + Rechnungen.wurzel(zahl1));
	}

}
