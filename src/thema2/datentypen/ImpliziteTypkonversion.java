package thema2.datentypen;

public class ImpliziteTypkonversion {

	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		short p = 200;
		int n = 500;
		long q = 100;
		float x = 2.5f;
		double y = 5.25;
		
		
		
		System.out.println(q + p * (b1 + b2));
	}

}
