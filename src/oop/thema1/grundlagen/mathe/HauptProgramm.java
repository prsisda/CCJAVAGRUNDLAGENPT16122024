package oop.thema1.grundlagen.mathe;

public class HauptProgramm {

	public static void main(String[] args) {
		
		double radius = 2.3;
		
		MatheUtils meinMatheUtils = new MatheUtils();
		
		// double kreisFlaeche = MatheUtils.PI * radius * radius;
		System.out.println("Fläche: " + meinMatheUtils.kreisFlaeche(radius));
		
		
		System.out.println("Fläche: " + MatheUtils.kreisFlaeche2(radius));
	}

}
