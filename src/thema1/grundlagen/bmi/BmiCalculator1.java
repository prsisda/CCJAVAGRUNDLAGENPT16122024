package thema1.grundlagen.bmi;

public class BmiCalculator1 {

	public static void main(String[] args) {

		System.out.println("BMI Calculator");

		double weight = 80.5;
		double height = 1.75;
		
		double bmi = weight / (height * height);
		System.out.println("BMI is: " + bmi); 
	}	
}
