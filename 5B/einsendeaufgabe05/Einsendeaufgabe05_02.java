package einsendeaufgabe05;


/*##################################################################
Einsendeaufgabe 5.2
####################################################################*/

// Die Klasse f�r die Listenelemente
class Listenelement{
	// Attribute
	String daten;
	Listenelement naechster;
	// letztenElement hat gleiche Wert f�r alle Instanzen der Klasse
	static Listenelement letztenElement;
	
	//Die Methode zum setzen der Daten
	void setDaten(String datenNeu){
		daten = datenNeu;
		naechster = null;
	}
	
	// Die Methode zum anh�ngen eines neues Elements
	void anhaengen(String datenNeu){
			naechster = new Listenelement();
			naechster.setDaten(datenNeu);
			// nach Anh�ngen die Ende der Liste neu defineiren
			letztenElement = naechster; 
			System.out.println("Daten " + datenNeu + " wurden eingef�gt.");
	}
	
	// Die Methode zum ausgeben der Liste
	void ausgeben() {
		System.out.println(daten);
		if (naechster != null)
			naechster.ausgeben();
	}
}


public class Einsendeaufgabe05_02 {
	
	public static void main(String[] args){
		// ein neues Listenelement erzeugen
		Listenelement listenAnfang = new Listenelement();
		// Die Daten im ersten Listenelement setzen
		listenAnfang.setDaten("Element 1");
		Listenelement.letztenElement = listenAnfang; 
		
		//weitere Elmenete in einer Schleife einf�gen
		for (int element = 2; element < 21; element ++)
			Listenelement.letztenElement.anhaengen("Element " + element);
		// Die liste ausgeben
		listenAnfang.ausgeben();
		
	}
	

}