package thema1.grundlagen.bmi;

import java.util.Scanner;

public class BmiCalculator2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("** Welcome to my BMI Calculator ** ");

		
		System.out.println("Your weight: ");
		double weight = scanner.nextDouble();
		
		System.out.println("Your height: ");
		double height = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("Your calculated BMI is: " + bmi); 
		
		
		scanner.close();
	}	
}
