
public class Zahnbürsten {
int menge;
char kateKunder;
char griffKunder;
char kategorie;
char griff;

public void getValue(int m, char k, char g) {
	menge = m;
	kategorie = k;
	griff =  g;
	
	}  
public void checkCase() {
	
	switch (kateKunder) {
	case 'w':
		kategorie = 'w';
		
		break;
	case 'm':
		kategorie = 'm';
		break;
	case 'h':
		kategorie = 'h';
		break;		
	}
	
	switch (griffKunder) {
	case 'g':
		griff = 'g';
		break;
	case 'n':
		griff = 'n';
		break;
	case 'k':
		griff = 'k';
		break;
	}
}
public void calculate() {
	double festPreis = 2.50;	
	double rabatt = 0;
	double redu = 0;	
	double ehorhung = 1;
	double gesamtRedu = 1;
	double gesamtPreis = 0;
	double gesamtRabatt = 0;

	
	
	if (menge > 500 && menge < 20000) {
		rabatt = 0.05;		
	}
	else if (menge > 20000) {
		rabatt = 0.10;
	}
	
	if (kategorie == 'w' && griff == 'k') {
		redu = 0.05;		
	}
	else if(kategorie == 'w' && griff == 'n' || griff == 'g') {
		redu = 0.01;
	}
	else if (kategorie == 'k') {
		redu += 0.02;
	}
	else if (kategorie == 'h' && griff == 'n') {
		ehorhung = 1.025;		
	}
	else if (kategorie == 'h' && griff == 'g') {
		ehorhung = 1.05;
	}
	
	gesamtRedu -= rabatt + redu ;
	gesamtPreis = menge * festPreis * gesamtRedu * ehorhung;
	gesamtRabatt = menge * festPreis - gesamtPreis; 
	System.out.println(gesamtPreis);
	System.out.println(gesamtRabatt);
}
public static void main(String[] args) {
	Zahnbürsten test = new Zahnbürsten();
	test.getValue(600,'w','k');
	test.checkCase();
	test.calculate();
	Zahnbürsten test02 = new Zahnbürsten();
	test02.getValue(25000, 'h', 'n');
	test02.checkCase();
	test02.calculate();
	
	
}
}
