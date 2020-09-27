import java.io.*;
import java.util.*;
public class Bestellung {
	
	public static void main (String[] args) {
		int menge;
		double preis;
		double bestellwert;
		double versandkosten;
		double rechnung;
		Scanner input = new Scanner(System.in);
		System.out.println("Geben Sie menge:");
		menge = input.nextInt();
		System.out.println("Geben Sie preis:");
		preis = input.nextDouble();
		bestellwert = menge * preis;
		if (bestellwert < 100 ) {
			versandkosten = 5.5;
		}else if (bestellwert > 100 && bestellwert < 200) {
			versandkosten = 3;
		}else {
			versandkosten = 0;			
		}
		rechnung = bestellwert + versandkosten;
		System.out.println("Bestellwert: " + bestellwert + " Rechnungsbetrag: " + rechnung);
		
	}	

}
