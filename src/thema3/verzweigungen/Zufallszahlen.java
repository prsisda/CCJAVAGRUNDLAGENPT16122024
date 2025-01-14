package thema3.verzweigungen;

import java.util.Random;

public class Zufallszahlen {

	public static void main(String[] args) {

		Random random = new Random();
		int zufallsZahl = random.nextInt(100); // [0 .... 99]
													
		System.out.println("Die Zufallszahl ist: " + zufallsZahl);
	}

}
