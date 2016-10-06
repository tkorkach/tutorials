package einsendeaufgabe05;

/*##################################################################
Einsendeaufgabe 5.3
####################################################################*/

//Die Klasse für die Listenelemente
class Listenelement2{
	String daten;
	Listenelement2 naechster;
	// Attribut für die Verweis auf die Vorherige Element
	Listenelement2 vorherige;
	
	//Die Methode zum setzen der Daten
	void setDaten(String datenNeu){
		daten = datenNeu;
		naechster = null;
		vorherige = null;
	}
	
	// Die Methode zum anhängen eines neues Elements	
	void anhaengen(String datenNeu, Listenelement2 aktiveElement){
		if (naechster == null){
			naechster = new Listenelement2();
			naechster.setDaten(datenNeu);
			// Referenz für den vorherigen Element setzen
			naechster.vorherige = aktiveElement;
			System.out.println("Daten " + datenNeu + " wurden eingefügt.");
		}
		else
			naechster.anhaengen(datenNeu, naechster);
	}
	
	// Die Methode zum ausgeben der Liste in Tabellenform
	void ausgeben() {		
		if (vorherige != null)
			System.out.print(vorherige.daten+"\t");
		else
			System.out.print("null" + "\t" + "\t");
		
		System.out.print(daten + "\t");
		if (naechster != null)
			{System.out.println(naechster.daten);
			naechster.ausgeben();}
		else
			System.out.print("null");
	}
}


public class Einsendaufgabe_05_03 {
	public static void main(String[] args){
		// ein neues Listenelement erzeugen
		Listenelement2 listenAnfang = new Listenelement2();
		// Die Daten im ersten Listenelement setzen
		listenAnfang.setDaten("Element 1");
		
		//weitere Elmenete in einer Schleife einfügen
		for (int element = 2; element < 6; element ++)
			listenAnfang.anhaengen(("Element " + element), listenAnfang);
		System.out.println("");
		//Tabellen Header ausgeben
		System.out.println("Vorheriger"+"\t"+"Aktueller"+"\t"+"Nächster");
		// Die liste ausgeben
		listenAnfang.ausgeben();
	}
}
