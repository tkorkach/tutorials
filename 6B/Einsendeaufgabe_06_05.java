package einsendeaufgabe06;

class Insekt{
	int laenge;
	int gewicht;
	
	Insekt(int laenge, int gewicht){
		this.laenge=laenge;
		this.gewicht = gewicht;
	}
	
	void essen(){
		laenge = laenge+1;
		gewicht = gewicht + 1;
	}
	
	void ausgabe(){
		System.out.print("Das insekt ist " + laenge + " cm lang und wiegt " + gewicht + " Gramm");
	}
}

class Biene extends Insekt{
	int geschwindigkeit;
	
	Biene(int laenge, int gewicht){
		super(laenge, gewicht);
		this.geschwindigkeit = 2;
	}
	
	@Override
	public void ausgabe(){
		System.out.println();
		super.ausgabe();
		System.out.print(" und ist " + geschwindigkeit + "m/sek schnell");
	}
}	


public class Einsendeaufgabe_06_05 {
	public static void main(String[] args){		
	Insekt Wilhelm = new Insekt(5,10);
	Wilhelm.essen();
	Wilhelm.ausgabe();
	
	Biene Maya = new Biene(10,10);
	Maya.essen();
	Maya.ausgabe();
	
	Maya.essen();
	Maya.ausgabe();
	}	
}
