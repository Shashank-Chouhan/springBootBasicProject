package test;
public class Test {	
	public static void main(String[] args) {
		int a = 120;
		int b = 50;  //assignment operator
//		assignment operators
		System.out.println(b+=5); //b = b+5, b = 57
		// +=, -=, /=, *= %=
		
//		arithmetic operators
//		System.out.println(a+b);
//		System.out.println(b-a);
//		System.out.println(a*b);
//		System.out.println(a / b);
//		System.out.println(a % b);
		
//		unary operators
		System.out.println(-130);
		System.out.println(b++);// b++ => b = b+1  // b = 51
		System.out.println(++b);// b = 52
		
		boolean areYoucrazy = true;
		System.out.println(!areYoucrazy);
		
		if(b == 57) { //>=, <=, !=, ==, >, < 
			System.out.println("hooray");
		}
		
		if(true && true) {
			System.out.println("true if both true");
		}
		if(true && false) {
			System.out.println("true if both true");
		}
		
		
		boolean legalAge = false;
		String k = legalAge==true ? "Legal": "Not legal";
		System.out.println(k);

		
		
		
	
	}
}
