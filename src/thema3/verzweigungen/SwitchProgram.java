package thema3.verzweigungen;

import java.util.Scanner;

public class SwitchProgram {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte Tag als Zahl eingeben: ");
		int tag = scanner.nextInt();
		
		switch (tag) {
			case 1:
				System.out.println("Montag");
				break;
			case 2:
				System.out.println("Dienstag");
				break;				
			case 3:
				System.out.println("Mittwoch");
				break;
			default:
				System.out.println("Ungültiger Tag");
		}
		
		scanner.close();
	}
}
