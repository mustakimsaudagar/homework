package Parametarized;

public class param {

	public void name () {
		
		System.out.println("mustakim");
	}
	
	public int add (int a , int b ) {
		
		return a+b ;
	}
	
	public String even_odd (int a , int b) {
		
		if (a%2==0) {
			return "even" ;
		}else {
			 return "odd" ;
		}
		
		
	}
	
	public int square (int a ) {
		int sqr = a*a;
		return sqr;
	}
	
	public int number (int a , int b) {
		if (a>b) {
			return a ;
		}else {
			return b ;
		}
	}
}
