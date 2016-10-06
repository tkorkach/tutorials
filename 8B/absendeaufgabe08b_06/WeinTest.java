/*##############################################
 * TestKlasse: Plausibilitätsprüfungen im Konstruktor
 ###############################################*/ 
package absendeaufgabe08b_06;

import javax.swing.JOptionPane;

public class WeinTest {
	public static void main(String[] args) {
		//eine neue Instanz für den Wein erzeugen
		try{
		Wein flasche1 = new Wein(10,20.5, "flasche1");
		//den Preis ausgeben
		System.out.println(flasche1.getPreisProFlasche());
		}
		catch (IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		//eine neue Instanz mit 2 Parametern, Alter ist falsch	
		try
		{
		Wein flasche2 = new Wein(-10,20.5, "flasche2");
		System.out.println(flasche2.getPreisProFlasche());
		}
		catch (IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		//eine neue Instanz mit 2 Parametern, Preis ist falsch		
		try
		{
		Wein flasche3 = new Wein(10,3, "flasche3");
		System.out.println(flasche3.getPreisProFlasche());
		}
		catch (IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		//eine neue Instanz mit 1 Parameter, Alter ist falsch			
		try
		{
		Wein flasche4 = new Wein(-100, "flasche4");
		System.out.println(flasche4.getPreisProFlasche());
		}
		catch (IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		//eine neue Instanz mit 1 Parameter, Preis ist falsch
		try
		{
		Wein flasche5 = new Wein(-8.45, "flasche5");
		System.out.println(flasche5.getPreisProFlasche());
		}
		catch (IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}		

		//eine neue Instanz mit 1 Parameter, alles ist richtig		
		try
		{
		Wein flasche6 = new Wein(18.45, "flasche6");
		System.out.println(flasche6.getPreisProFlasche());
		}
		catch (IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}		
		
	}
}
