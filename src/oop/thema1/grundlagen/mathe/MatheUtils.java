package oop.thema1.grundlagen.mathe;

public class MatheUtils {

	// Klassenattribut
	public static final double PI = 3.14159;

	public double abc = 23;
	
	// Objektmethode
	public double kreisFlaeche(double radius) {
		return PI * radius * radius;
	}
	
	// Klassenmethode
	public static double kreisFlaeche2(double radius) {
		return PI * radius * radius;
	}
	
	
	
}
