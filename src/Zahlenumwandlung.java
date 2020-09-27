
public class Zahlenumwandlung {
int Zahl;
String textZahl;

	
	public void umgewandelt(int i) {
		Zahl = i;
		
		switch(Zahl) {
		case 0:
			textZahl = "null";
			break;
		case 1: 
			textZahl = "eins";
			break;
		case 2:
			textZahl = "zwei";
			break;
		case 3:
			textZahl = "drei";
			break;
		case 4:
			textZahl = "vier";
			break;
		case 5:
			textZahl = "funf";
			break;
		case 6:
			textZahl = "sechs";
			break;
		case 7:
			textZahl = "sieben";
			break;
		case 8:
			textZahl = "acht";
			break;
		case 9:
			textZahl = "neun";
			break;
		case 10:
			textZahl = "zehn";
			break;
			
		}
		
		System.out.println("Eingabe:" + Zahl + " Ausgabe:" + textZahl);
	}
	
	public static void main (String[] args) {
		Zahlenumwandlung test = new Zahlenumwandlung();
		test.umgewandelt(10);
		
	}


}
