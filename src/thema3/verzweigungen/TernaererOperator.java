package thema3.verzweigungen;

import java.util.Scanner;

public class TernaererOperator {
	
	public static void main(String[] args) {
		
		int zahl = 10;
		
		String ergebnis = (zahl > 5) ? "Größer als 5" : "Kleiner oder gleich 5";
		
		System.out.println(ergebnis);
	}
}
