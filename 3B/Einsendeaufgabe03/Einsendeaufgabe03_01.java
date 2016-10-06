package Einsendeaufgabe03;
/*###################################################
 * Einsendeaufgabe 3.1
 * ################################################## */
import javax.swing.*;

public class Einsendeaufgabe03_01 {
	public static void main (String [] args) {
		int zahl;
		zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Jahreszahl ein: "));
		if ((zahl%4 == 0) && (zahl%100 != 0))
		System.out.println("Das eingegebenes Jahr ist ein Schaltjahr");
		else
			if (zahl%400 == 0)
				System.out.println("Das eingegebenes Jahr ist ein Schaltjahr");
			else System.out.println("Das eingegebenes Jahr ist kein Schaltjahr");	
		
		System.out.println("Die Jahreszahl war " + zahl);
		System.exit(0);
	}
}
