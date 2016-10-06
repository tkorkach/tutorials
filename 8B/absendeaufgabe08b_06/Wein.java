/* ################################
 * Die Klasse f�r den Wein
 * Jetzt mit Plausibilit�tspr�fung  
 ##################################*/
package absendeaufgabe08b_06;

public class Wein {
	private int alter;
	private double grundpreis;
	private double preisProFlasche;
	// Variable Name f�r die Vervollst�ndigung der Fehlermeldung in Exception
	private String name;
	
	//der StandardkKonstruktor
	public Wein() {
		//er ruft �ber this() den Konstruktor mit den beiden Parametern auf
		//und �bergibt die Standardwerte
		this(1, 10, "FlascheXXX");
	}
	
	//der Konstruktor setzt das Alter
	//der Preis erh�lt einen Standardwert
	public Wein(int alter, String name) {
		//er ruft ebenfalls �ber this den Konstruktor mit den beiden Parametern auf
		this(alter, 10, name);
	}
	
	//der Konstruktor setzt den Preis
	//das Alter erh�lt einen Standardwert
	public Wein(double grundpreis, String name) {
		//und dieser Konstruktor ruft auch den Konstruktor mit den beiden Parametern auf
		this(1, grundpreis, name);
	}
	
	//der Konstruktor setzt das Alter und den Grundpreis
	//er enth�lt jetzt Plausibilit�tspr�fungen
	public Wein (int alter, double grundpreis, String name) throws IllegalArgumentException{
		//die Plausibilit�tspr�fung f�r das Alter
		this.name = name;
		if (alter > 0)
			this.alter = alter;
		//sonst den Standardwert 1 setzen
		else{
			//System.out.println(this.);
			throw new IllegalArgumentException("Alter kann nicht negativ sein. Instanz " +this.name+ " wurde nicht generiert");
			}
		//und auch f�r den Preis
		if (grundpreis > 9)
			this.grundpreis = grundpreis;
		else{
			throw new IllegalArgumentException("Grundpreis kann nicht kleiner 10 sein. Instanz " +this.name+ " wurde nicht generiert");
		}
	}
	
	//die Methode berechnet den Preis pro Flasche
	public void preisBerechnen() {
		preisProFlasche = alter * grundpreis;
	}
	
	//die Methode liefert den Preis pro Flasche
	public double getPreisProFlasche() {
		preisBerechnen();
		return preisProFlasche;
	}
}
