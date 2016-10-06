package Einsendeaufgabe03;
/*###################################################
 * Einsendeaufgabe 3.4
 * ################################################## */
import javax.swing.*;


public class Einsendeaufgabe03_04 {
	
	static float addition(float a, float b){
		float ergebnis = a+b;
		return ergebnis;
	}
	
	static float substraktion(float a, float b){
		float ergebnis = a-b;
		return ergebnis;
	}
	
	static float multiplikation(float a, float b){
		float ergebnis = a*b;
		return ergebnis;
	}
	
	static float division(float a, float b){
		float ergebnis;
		if (b==0)
			ergebnis = 0;
		else
		ergebnis = a/b;
		return ergebnis;
	}
	
		public static void main(String[] args){
			float einVariable1=1;
			float einVariable2 =1;
			char rechnerOperation;
			boolean var1Valid = false;
			boolean var2Valid = false;
			while (var1Valid == false){
				try {
					einVariable1 = Float.parseFloat(JOptionPane.showInputDialog("Geben Sie bitte erste Zahl ein"));
					var1Valid =true;}
				catch (NumberFormatException e){
					System.out.println("Die eingegeben Zahl war nicht gültig. Bitte wiederholen");
				}}
			while (var2Valid == false){
				try {
					einVariable2 = Float.parseFloat(JOptionPane.showInputDialog("Geben Sie bitte zweite Zahl ein"));
					var2Valid =true;}
				catch (NumberFormatException e){
					System.out.println("Die eingegeben Zahl war nicht gültig. Bitte wiederholen");
				}}
					rechnerOperation = (JOptionPane.showInputDialog("Wählen Sie bitte eine Rechneroperation aus:\n+\n-\n*\n/")).charAt(0);
			switch (rechnerOperation){
			case '+':
				System.out.println(einVariable1 + "+" + einVariable2 +"="+ addition(einVariable1,einVariable2));
				break;
			case '-':
				System.out.println(einVariable1 + "-" + einVariable2 +"="+substraktion(einVariable1,einVariable2));
				break;
			case '*':
				System.out.println(einVariable1 + "*" + einVariable2 +"="+multiplikation(einVariable1,einVariable2));
				break;
			case '/':
				if (einVariable2==0)
				System.out.println("Division durch 0 geht nicht!");
				else
				System.out.println(einVariable1 + "/" + einVariable2 +"="+division(einVariable1,einVariable2));
				break;
			default:
				System.out.println("Sie haben eine ungünltige Rechneoperation eingegeben.");
				break;
			}
			System.exit(0);
		}
}
