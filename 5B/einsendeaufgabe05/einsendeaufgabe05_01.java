package einsendeaufgabe05;

/*##################################################################
 Einsendeaufgabe 5.1
####################################################################*/

class Ferhseher{
	// Lautstärke von 0 bis 10 möglich. Default Wert = 5
	int lautstaerke=5;
	// Programm von 1 bis 30 möglich. Default Wert = 1
	int programm=1;
	// Funktioniert so wie ein/aus Knopf bei dem Fernseher
	boolean fernseherIstAn = false;

	
	// Wenn Fernseher ist an, wird es ausgeschaltet, wenn es aus ist, wird es angeschaltet
	void zustandAendern(){
		if (fernseherIstAn == false)
			fernseherIstAn = true;
		else
			fernseherIstAn = false;
	}
	
	/* Erhöht die Lautstärke bei 1 bis maximale wert = 10 erreicht ist. 
	Fernseher muss an sein*/
	void lautstraerkeHoch(){
		if ((fernseherIstAn == true) && (lautstaerke < 10))
			lautstaerke = lautstaerke + 1;
	}
	
	/* Verringert die Lautstärke bei 1 bis minimale wert = 0 erreicht ist
	Fernseher muss an sein*/
	void lautstraerkeRunter(){
		if ((fernseherIstAn == true) && (lautstaerke > 0))
			lautstaerke = lautstaerke - 1;
	}
	
	/* Erhöht das Programm um 1. Wenn maximale Wert = 30 ereicht 1, spring es wieder zum 1
	Fernseher muss an sein*/	
	void programmHoch(){
		if (fernseherIstAn == true){
			if (programm != 30)
				programm = programm + 1;
			else 
				programm = 1;
		}
	}	
	
	
	/* Verringert das Programm um 1. Wenn inimale Wert = 0 erreicht ist, spring es zum 30
	Fernseher muss an sein*/	
	void programmRunter(){
		if (fernseherIstAn == true){
			if (programm != 1)
				programm = programm - 1;
			else
				programm =  30;
		}
	}	
	
	//Gibt die Parameter von Fernseher aus, wenn es angeschaltet ist
	void zustandAusgeben(){
		if (fernseherIstAn == false)
			System.out.println("Fernseher ist aus");
		else{
			System.out.println("Fernseher ist an");
			System.out.println("Lautstärke ist gleich " + lautstaerke);
			System.out.println("Programm ist gleich " + programm);
		}
		System.out.println();
	}
	
}

public class einsendeaufgabe05_01 {
	public static void main(String args[]){
		// eine Istanz der klasse Fernseher initialisieren
		Ferhseher MeinFernseher = new Ferhseher();
		//Start Zustand ausgeben
		MeinFernseher.zustandAusgeben();
		
		// Fernseher einschalten, zustand ausgeben 
		MeinFernseher.zustandAendern();
		MeinFernseher.zustandAusgeben();		
		
		// Lautstarke und Programm ein mal runter drehen, Zustand ausgeben 
		MeinFernseher.lautstraerkeRunter();
		MeinFernseher.programmRunter();
		MeinFernseher.zustandAusgeben();	
		
		// Fernseher ausschalten und versuchen die Lautstarke und Programm zu ändern
		MeinFernseher.zustandAendern();
		MeinFernseher.lautstraerkeRunter();
		MeinFernseher.programmRunter();		
		MeinFernseher.zustandAusgeben();
		
		// Fernseher einschalten, Die Programm und Lautstarke haben sich nicht verändert
		MeinFernseher.zustandAendern();		
		MeinFernseher.zustandAusgeben();	
		
	}
}
