package thema1.grundlagen;

public class Datentypen {

	public static void main(String[] args) {
		berechnungUndAusgabe(12, 20);
		berechnungUndAusgabe(10, 200);
	}

	public static void berechnungUndAusgabe(int zahl1, int zahl2) {
		System.out.println("Ergebnis: " + berechnung(zahl1, zahl2));		
	}
	
	public static int berechnung(int zahl1, int zahl2) {
		return zahl1 + zahl2;
	}
}
