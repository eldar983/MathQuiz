import java.util.Scanner;

public class MathQuiz {
	
	static int broj1 = 0;
	static int broj2 = 0;
	static double solution=0; 
	
	public static void sabiranje(Scanner unos) {
		broj1 = (int)(Math.random()*10)+1;
		broj2 = (int)(Math.random()*10)+1;
		System.out.println("Koliko je "+broj1+" + "+ broj2 );
	
		
	}
	
	public static void oduzimanje(Scanner unos) {
		broj1 = (int)(Math.random()*10)+1;
		broj2 = (int)(Math.random()*10)+1;
		
	}
	
	public static void mnozenje(Scanner unos) {
		broj1 = (int)(Math.random()*10)+1;
		broj2 = (int)(Math.random()*10)+1;
		
			
	}
	
	public static void dijeljenje(Scanner unos) {
		broj1 = (int)(Math.random()*10)+1;
		broj2 = (int)(Math.random()*10)+1;

		//da bi bili sigurni da je broj1 djeljiv sa brojem2 
		broj1=broj1*broj2;
		
		
	}
}
