package Einsendeaufgabe03;
/*###################################################
 * Einsendeaufgabe 3.5
 * ################################################## */
import javax.swing.*;


public class Einsendeaufgabe03_05 {
	static int addition(int a, int b){
		int ergebnis = a+b;
		return ergebnis;
	}
	
	static int substraktion(int a, int b){
		int ergebnis = a-b;
		return ergebnis;
	}
	
	static int multiplikation(int a, int b){
		int ergebnis = a*b;
		return ergebnis;
	}
	
	static int division(int a, int b){
		int ergebnis;
		if (b==0)
			ergebnis = 0;
		else
		ergebnis = a/b;
		return ergebnis;
	}
	
	static int potenz(int a, int b){
		int ergebnis= 1;
		for (int i=1; i<=b; i++)
		{
			ergebnis = ergebnis*a;
		}
		return ergebnis;
	}
	
		public static void main(String[] args){
			int einVariable1, einVariable2;
			char rechnerOperation;
			einVariable1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte erste Zahl ein"));
			einVariable2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte zweite Zahl ein"));
			rechnerOperation = (JOptionPane.showInputDialog("Wählen Sie bitte eine Rechneroperation aus:\n+\n-\n*\n/\n^")).charAt(0);
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
			case '^':
				System.out.println(einVariable1 + "^" + einVariable2 +"="+potenz(einVariable1,einVariable2));
				break;				
			default:
				System.out.println("Sie haben eine ungünltige Rechneoperation eingegeben.");
				break;
			}
			System.exit(0);
		}
}

