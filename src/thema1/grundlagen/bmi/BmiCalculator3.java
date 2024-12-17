package thema1.grundlagen.bmi;

import java.util.Scanner;

import utils.IO;

/**
 * Beispielwerte: Your weight: 80.5 Your height: 1.9 Your calculated BMI is:
 * 22.3
 */
public class BmiCalculator3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("** Welcome to my BMI Calculator ** ");

		double weight = IO.promptAndReadDouble("Your weight: ");
		double height = IO.promptAndReadDouble("Your height: ");

		double bmi = weight / (height * height);
		System.out.println("Your calculated BMI is: " + IO.round(bmi, 2));

		scanner.close();
	}
}
