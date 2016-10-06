package einsendeaufgabe_4;
/* ###############################################
 * Einsendeaufgabe 4
 #################################################*/
import javax.swing.*;


public class Java04b_einsendeaufgabe {
	
	/*Array befüllen
	 * Argumente: Array mit Kisten
	 * Funktionsweise: Suche ein leeres Array Element 1 x 4; befülle dieses leere Element mit den Daten für 1 Kiste 
	 * Rückgabewert: keine
	 */
	static void eingabe(int[][] kistenArray){
		//Index von noch nicht befüllte Element ermitteln. Arrayelemente werden nacheinander befüllt
		int firstEmptyElement = 0;
		for (int element =0; element < (kistenArray.length); element ++){
			if (kistenArray[element][0] != 0)
				firstEmptyElement++;
		}
		// Wenn Index = 75 ist, gibt es im Array kein leeres Elemente mehr
		if (firstEmptyElement ==75) 
			System.out.println("Eingabe nicht möglich. Die Anzahl von Kisten ist auf 75 begrenzt");
		// Wenn es noch leere Elemente gibt, wird eine davon mit Daten befüllt
		else{
			kistenArray[firstEmptyElement][0] = firstEmptyElement + 1;
			kistenArray[firstEmptyElement][1] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die Kistenbreite ein"));
			kistenArray[firstEmptyElement][2] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die Kistenhöhe ein"));
			kistenArray[firstEmptyElement][3] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die Kistenlänge ein"));
		}
		System.out.println("Kiste Nr." + (firstEmptyElement + 1) + " ist erfolgreich angelegt.");
	}
	

	/*Daten für alle Kisten ausgeben
	 * Argumente: Array mit Kisten
	 * Funktionsweise: Daten für alle  im System angelegte Kisten in Tabellenform ausgeben
	 * Rückgabewert: keine
	 */
	static void listeAusgabe(int[][] kistenArray){
		System.out.println("Der Kistenbestand ist:");
		System.out.println("Nummer\tBreite\tHöhe\tLänge");
		// Externe schleife geht jede Kiste durch
		for (int elementExt =0; elementExt < (kistenArray.length); elementExt ++){
			// Prüfung ob Kiste schon im System angelegt ist
			if (kistenArray[elementExt][0] != 0){
				// Interne Schleife geht jede Eigenschaft der Kiste durch und gibt es in tabellenform aus
				for (int elementInt = 0; elementInt < 4; elementInt++)
					System.out.print(kistenArray[elementExt][elementInt]+"\t");
			System.out.print("\n");
			}
		}
		System.out.println("");
	}
	

	/*Daten für eine Kiste ausgeben
	 * Argumente: Array mit Kisten
	 * Funktionsweise: Daten für eine angelegte in System Kiste in Tabellenform ausgeben
	 * Rückgabewert: keine
	 */
	static void anzeigen(int[][] kistenArray){
		// Butzer wird nach Kistennummer gefragt
		int kistenNummer = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Nummer der Kiste ein, der eingezeigt werden soll:"));
		// Die Kistennummer wird geprüft ob es unter 75 ist, und schon angelegt ist
		if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] != 0)){
			System.out.println("Der Größe der Kiste Nr." + kistenNummer + " ist:");
			System.out.println("Breite\tHöhe\tLänge");
			for (int element = 1; element < 4; element ++)
				System.out.print(kistenArray[(kistenNummer-1)][element]+"\t");
		}
		// Daten für nicht angelegte Kisten werden nicht angezeigt
		else if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] == 0))
			System.out.println("Anzeige nicht möglich. Der Kiste Nr. " +  kistenNummer +" ist nicht angelegt");
		// Daten für die Kisten mit Nr. > 75 werden nicht angezeigt
		else
			System.out.println("Anzeige nicht möglich. Kiste Nr " + kistenNummer + 
					" existiert nicht. Die Anzahl von Kisten ist auf 75 begrenzt.");
		System.out.println("");
	}
	

	/*Daten für eine Kiste ändern
	 * Argumente: Array mit Kisten
	 * Funktionsweise: Daten für eine angelegte im System Kiste ändern
	 * Rückgabewert: keine
	 */
	static void aendern(int[][] kistenArray){
		int kistenNummer = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Nummer der Kiste ein, deren Größe geändert werden soll:"));
		// Die Kistennummer wird geprüft ob es unter 75 ist, und schon angelegt ist. Dann werden die Daten geändert
		if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] != 0)){
			kistenArray[(kistenNummer -1)][1] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die NEU Kistenbreite ein"));
			kistenArray[(kistenNummer -1)][2] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die NEU Kistenhöhe ein"));
			kistenArray[(kistenNummer -1)][3] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die NEU Kistenlänge ein"));
			System.out.println("Daten der Kiste Nr." + (kistenNummer) + " sind erfolgreich geändert.");
		}
		// Für die anderen Fälle kommen die entsprechende Hinweise
		else if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] == 0))
			System.out.println("Änderung nicht möglich. Der Kiste Nr. " +  kistenNummer +" ist nicht angelegt");
		else
			System.out.println("Änderung nicht möglich. Kiste Nr " + kistenNummer + 
					" existiert nicht. Die Anzahl von Kisten ist auf 75 begrenzt.");
	}
	
	/*Daten für eine Kiste löschen
	 * Argumente: Array mit Kisten
	 * Funktionsweise: Daten für eine angelegte im System Kiste löschen
	 * Rückgabewert: keine
	 */
	static void loeschen(int[][] kistenArray){
		int kistenNummer = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Nummer der Kiste ein, der gelöscht werden soll:"));
		// Kistennummer wird nach Gültigkeit geprüft. Danach werden die Kisten eigenschaften gleich 0 gesetzt
		if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] != 0)){
			for (int element=0; element <4; element++)
				kistenArray[(kistenNummer -1)][element] = 0;
			System.out.println("Daten der Kiste Nr." + (kistenNummer) + " sind erfolgreich gelöscht.");
		}
		// Falls nummer nicht gültig ist, werden entsprechende Hinweise angezeigt
		else if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] == 0))
			System.out.println("Löschen nicht möglich. Der Kiste Nr." + kistenNummer + " ist nicht angelegt");			
		else
			System.out.println("Löschen nicht möglich. Kiste Nr " + kistenNummer + 
					" existiert nicht. Die Anzahl von Kisten ist auf 75 begrenzt.");
	}
	
	public static void main(String[] args){
		// Array für Anlage von maximal 75 Kisten, jede Kiste hat 4 Eigenschaften
		int [][] kistenArray = new int [75][4];
		// Parameter für Switch
		char kistenOperation;
		// Switch anweiseung wird so lange wiederholt, bis es mit der Eingabe 'f' beendet wird
		System.out.println("Programm Lagerverwaltung ist gestartet");
		do{
		kistenOperation = (JOptionPane.showInputDialog("Wählen Sie bitte eine Operation aus:" 
				+ "\n(wählen sie a,b,c,d, e oder f aus)"
				+ "\na) Neu Kiste anlegen"
				+ "\nb) Kiste löchen\n"
				+ "c) Kistendaten ändern\n"
				+ "d) Kistendaten anzeigen\n"
				+ "e) Gesamt Kistenbestand anzeigen\n"
				+ "f) Menu beenden")).charAt(0);
			switch (kistenOperation){
			case 'a':
				eingabe(kistenArray);
				break;
			case 'b':
				loeschen(kistenArray);
				break;
			case 'c':
				aendern(kistenArray);
				break;
			case 'd':
				anzeigen(kistenArray);			
				break;
			case 'e':
				listeAusgabe(kistenArray);
				break;
			case 'f':
				System.out.println("Das Programm ist beendet.");
				break;
			default:
				System.out.println("Sie haben eine ungünltige Operation eingegeben.");
				break;
			}
		} while (kistenOperation != 'f'); 
		
		System.exit(0);
	}

}
