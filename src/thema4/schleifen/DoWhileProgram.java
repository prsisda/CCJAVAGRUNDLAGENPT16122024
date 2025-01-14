package thema4.schleifen;

import java.util.Scanner;

public class DoWhileProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		int pin;
		do {
			System.out.println("Bitte geben Sie Ihre PIN ein: ");
			pin = scanner.nextInt();
			System.out.println(pin);
		} while (pin != 1234);
		
		System.out.println("Programm ENDE");
		scanner.close();
	}
}
