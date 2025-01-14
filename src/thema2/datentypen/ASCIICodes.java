package thema2.datentypen;

/**
 * Schreiben Sie ein Java-Programm, das den ASCII-Wert jedes Zeichens im Text 
 * ‘Hello World' ausgibt. 
 * Verwenden Sie für jede einzelne Buchstabe im Text eine separate
char-Variable.
 */
public class ASCIICodes {

	public static void main(String[] args) {

		char char1 = 'H';
		char char2 = 'e';
		char char3 = 'l';
		char char4 = 'l';
		char char5 = 'o';
		char char6 = ',';
		char char7 = ' ';
		char char8 = 'W';
		char char9 = 'o';
		char char10 = 'r';
		char char11 = 'l';
		char char12 = 'd';
		char char13 = '!';
	
		System.out.println("Zeichen \t\tASCII-Wert");
		System.out.println("H\t\t\t"  + (int) char1);
		System.out.println("e\t\t\t"  + (int) char2);
		System.out.println("l\t\t\t"  + (int) char3);
		System.out.println("l\t\t\t"  + (int) char4);
		System.out.println("o\t\t\t"  + (int) char5);
		
	}

}
