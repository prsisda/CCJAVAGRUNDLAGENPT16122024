package oop.thema1.grundlagen;

public class HauptProgramm {

	public static void main(String[] args) {

		// Unser Objekt
		Hund hund1 = new Hund();
		System.out.println(hund1.alter);

		Hund hund2 = new Hund("Ildar");
		System.out.println(hund2.alter + " " + hund2.name);
	}

}
