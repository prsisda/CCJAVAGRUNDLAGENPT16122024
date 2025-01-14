package thema2.datentypen;

public class OpIner {

	public static void main(String[] args) {

//		int i=0;
//		int n = ++i;
//		System.out.println("A: i = " + i + " n = " + n);
//		
		
		int i = 15; 
		int tmp = i;
		int n = i = i +=3;
		
		System.out.println("i: " + i);
		System.out.println("n: " + n);
		System.out.println(tmp);
	}

}
