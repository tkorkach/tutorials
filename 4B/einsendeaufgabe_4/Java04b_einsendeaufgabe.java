package einsendeaufgabe_4;
/* ###############################################
 * Einsendeaufgabe 4
 #################################################*/
import javax.swing.*;


public class Java04b_einsendeaufgabe {
	
	/*Array bef�llen
	 * Argumente: Array mit Kisten
	 * Funktionsweise: Suche ein leeres Array Element 1 x 4; bef�lle dieses leere Element mit den Daten f�r 1 Kiste 
	 * R�ckgabewert: keine
	 */
	static void eingabe(int[][] kistenArray){
		//Index von noch nicht bef�llte Element ermitteln. Arrayelemente werden nacheinander bef�llt
		int firstEmptyElement = 0;
		for (int element =0; element < (kistenArray.length); element ++){
			if (kistenArray[element][0] != 0)
				firstEmptyElement++;
		}
		// Wenn Index = 75 ist, gibt es im Array kein leeres Elemente mehr
		if (firstEmptyElement ==75) 
			System.out.println("Eingabe nicht m�glich. Die Anzahl von Kisten ist auf 75 begrenzt");
		// Wenn es noch leere Elemente gibt, wird eine davon mit Daten bef�llt
		else{
			kistenArray[firstEmptyElement][0] = firstEmptyElement + 1;
			kistenArray[firstEmptyElement][1] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die Kistenbreite ein"));
			kistenArray[firstEmptyElement][2] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die Kistenh�he ein"));
			kistenArray[firstEmptyElement][3] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die Kistenl�nge ein"));
		}
		System.out.println("Kiste Nr." + (firstEmptyElement + 1) + " ist erfolgreich angelegt.");
	}
	

	/*Daten f�r alle Kisten ausgeben
	 * Argumente: Array mit Kisten
	 * Funktionsweise: Daten f�r alle  im System angelegte Kisten in Tabellenform ausgeben
	 * R�ckgabewert: keine
	 */
	static void listeAusgabe(int[][] kistenArray){
		System.out.println("Der Kistenbestand ist:");
		System.out.println("Nummer\tBreite\tH�he\tL�nge");
		// Externe schleife geht jede Kiste durch
		for (int elementExt =0; elementExt < (kistenArray.length); elementExt ++){
			// Pr�fung ob Kiste schon im System angelegt ist
			if (kistenArray[elementExt][0] != 0){
				// Interne Schleife geht jede Eigenschaft der Kiste durch und gibt es in tabellenform aus
				for (int elementInt = 0; elementInt < 4; elementInt++)
					System.out.print(kistenArray[elementExt][elementInt]+"\t");
			System.out.print("\n");
			}
		}
		System.out.println("");
	}
	

	/*Daten f�r eine Kiste ausgeben
	 * Argumente: Array mit Kisten
	 * Funktionsweise: Daten f�r eine angelegte in System Kiste in Tabellenform ausgeben
	 * R�ckgabewert: keine
	 */
	static void anzeigen(int[][] kistenArray){
		// Butzer wird nach Kistennummer gefragt
		int kistenNummer = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Nummer der Kiste ein, der eingezeigt werden soll:"));
		// Die Kistennummer wird gepr�ft ob es unter 75 ist, und schon angelegt ist
		if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] != 0)){
			System.out.println("Der Gr��e der Kiste Nr." + kistenNummer + " ist:");
			System.out.println("Breite\tH�he\tL�nge");
			for (int element = 1; element < 4; element ++)
				System.out.print(kistenArray[(kistenNummer-1)][element]+"\t");
		}
		// Daten f�r nicht angelegte Kisten werden nicht angezeigt
		else if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] == 0))
			System.out.println("Anzeige nicht m�glich. Der Kiste Nr. " +  kistenNummer +" ist nicht angelegt");
		// Daten f�r die Kisten mit Nr. > 75 werden nicht angezeigt
		else
			System.out.println("Anzeige nicht m�glich. Kiste Nr " + kistenNummer + 
					" existiert nicht. Die Anzahl von Kisten ist auf 75 begrenzt.");
		System.out.println("");
	}
	

	/*Daten f�r eine Kiste �ndern
	 * Argumente: Array mit Kisten
	 * Funktionsweise: Daten f�r eine angelegte im System Kiste �ndern
	 * R�ckgabewert: keine
	 */
	static void aendern(int[][] kistenArray){
		int kistenNummer = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Nummer der Kiste ein, deren Gr��e ge�ndert werden soll:"));
		// Die Kistennummer wird gepr�ft ob es unter 75 ist, und schon angelegt ist. Dann werden die Daten ge�ndert
		if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] != 0)){
			kistenArray[(kistenNummer -1)][1] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die NEU Kistenbreite ein"));
			kistenArray[(kistenNummer -1)][2] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die NEU Kistenh�he ein"));
			kistenArray[(kistenNummer -1)][3] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die NEU Kistenl�nge ein"));
			System.out.println("Daten der Kiste Nr." + (kistenNummer) + " sind erfolgreich ge�ndert.");
		}
		// F�r die anderen F�lle kommen die entsprechende Hinweise
		else if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] == 0))
			System.out.println("�nderung nicht m�glich. Der Kiste Nr. " +  kistenNummer +" ist nicht angelegt");
		else
			System.out.println("�nderung nicht m�glich. Kiste Nr " + kistenNummer + 
					" existiert nicht. Die Anzahl von Kisten ist auf 75 begrenzt.");
	}
	
	/*Daten f�r eine Kiste l�schen
	 * Argumente: Array mit Kisten
	 * Funktionsweise: Daten f�r eine angelegte im System Kiste l�schen
	 * R�ckgabewert: keine
	 */
	static void loeschen(int[][] kistenArray){
		int kistenNummer = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Nummer der Kiste ein, der gel�scht werden soll:"));
		// Kistennummer wird nach G�ltigkeit gepr�ft. Danach werden die Kisten eigenschaften gleich 0 gesetzt
		if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] != 0)){
			for (int element=0; element <4; element++)
				kistenArray[(kistenNummer -1)][element] = 0;
			System.out.println("Daten der Kiste Nr." + (kistenNummer) + " sind erfolgreich gel�scht.");
		}
		// Falls nummer nicht g�ltig ist, werden entsprechende Hinweise angezeigt
		else if ((kistenNummer <= 75) && (kistenArray[(kistenNummer-1)][0] == 0))
			System.out.println("L�schen nicht m�glich. Der Kiste Nr." + kistenNummer + " ist nicht angelegt");			
		else
			System.out.println("L�schen nicht m�glich. Kiste Nr " + kistenNummer + 
					" existiert nicht. Die Anzahl von Kisten ist auf 75 begrenzt.");
	}
	
	public static void main(String[] args){
		// Array f�r Anlage von maximal 75 Kisten, jede Kiste hat 4 Eigenschaften
		int [][] kistenArray = new int [75][4];
		// Parameter f�r Switch
		char kistenOperation;
		// Switch anweiseung wird so lange wiederholt, bis es mit der Eingabe 'f' beendet wird
		System.out.println("Programm Lagerverwaltung ist gestartet");
		do{
		kistenOperation = (JOptionPane.showInputDialog("W�hlen Sie bitte eine Operation aus:" 
				+ "\n(w�hlen sie a,b,c,d, e oder f aus)"
				+ "\na) Neu Kiste anlegen"
				+ "\nb) Kiste l�chen\n"
				+ "c) Kistendaten �ndern\n"
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
				System.out.println("Sie haben eine ung�nltige Operation eingegeben.");
				break;
			}
		} while (kistenOperation != 'f'); 
		
		System.exit(0);
	}

}
