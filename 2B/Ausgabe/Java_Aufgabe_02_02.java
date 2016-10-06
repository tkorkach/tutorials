package Ausgabe;
/*###################################################
 * Einsendeaufgabe 2.2
 * ################################################## */
import javax.swing.*;

public class Java_Aufgabe_02_02 {
	public static void main(String[] args){
		String eingabe1, eingabe2;
		int zahl1, zahl2;
		double ergebnis;
		eingabe1 = JOptionPane.showInputDialog("Bitte machen Sie ihre erste Eingabe.");
		System.out.println("Ihre erste Eingabe war: " + eingabe1);
		eingabe2 = JOptionPane.showInputDialog("Bitte machen Sie ihre zweite Eingabe.");
		System.out.println("Ihre zweite Eingabe war: " + eingabe2);
		zahl1 = Integer.parseInt(eingabe1);
		zahl2 = Integer.parseInt(eingabe2);
		ergebnis = (double)zahl1/(double)zahl2;
		System.out.println("Das Ergebnis der Division " + eingabe1 +"/"+ eingabe2 + " ist " + ergebnis);
		
		System.exit(0);
		
	}
}