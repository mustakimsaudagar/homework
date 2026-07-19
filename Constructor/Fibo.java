package Constructor;

public class Fibo {
	
	int num ;
	
	public Fibo (int num) {
		
		this.num = num ;
		
	}
	
	public void display () {
		
		int first = 0 ;
		int second = 1 ;
		
		System.out.println("fibonacci series");
		
		for ( int i = 1 ; i<=num; i++) {
			
			System.out.println(first + " ");
			
			int next = first + second ;
			first = second ;
			second = next ;
			
			
			
		}
		
		
	}
}
