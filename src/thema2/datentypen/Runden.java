package thema2.datentypen;

import java.util.Scanner;

public class Runden {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl eingeben: ");
		double zahl = scanner.nextDouble();
		int zahlMal100 = (int) (zahl * 100.0 + 0.5);
		double zahlGerundet = zahlMal100 / 100.0;
		System.out.println("Gerundet: " + zahlGerundet);
		
		scanner.close();
	}

}
