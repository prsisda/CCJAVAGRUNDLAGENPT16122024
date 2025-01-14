package oop.thema1.grundlagen;

public class Hund {
	
	String name;
	
	String rasse;
	
	int alter;
	
	String farbe;
	
	String geschlecht;
	
	
	// Default-Konstruktor
	Hund() {
		alter = 1;
		farbe = "weiss";
	}
	
	Hund(String name) {
		super(); // Aufruf des Default-Konstruktors
		this.name = name;
	}
	
	public void bellen() {
		System.out.println(name + " bellt.");
	}
	
	public void fressen() {
		System.out.println(name + " frisst.");
	}
	
	public void schlafen() {
		System.out.println(name + " schläft.");
	}
	
	
	
	public void familienstand() {
		if(alter > 1) {
			System.out.println("verheiratet");
		} else {
			System.out.println("noch ein kindchen");
		}
	}
}
