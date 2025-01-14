package thema3.verzweigungen;

public class GroessteZahlMitSwitch {

	public static void main(String[] args) {

		final int zahl1=2 , zahl2=30000, zahl3=248;
		int groessteZahl;
		
		switch(Math.max(zahl1, Math.max(zahl2, zahl3))) {
		case zahl1:
			groessteZahl = zahl1;
			break;
		case zahl2:
			groessteZahl = zahl2;
			break;
		default:
			groessteZahl = zahl3;
			break;
		}
		
		System.out.println("Die Größte Zahl ist : " + groessteZahl);
	}
	

}
