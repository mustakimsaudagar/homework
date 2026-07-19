package Constructor;

public class Palindrome {
	
	int num ;
	
	public Palindrome (int num) {
		
		this.num = num ;
	
	}
	
	public void display () {
		
		int reverse = 0 ;
		int num1 = num ;
		
		while ( num>0) {
			
			int digit = num % 10;

			reverse = reverse * 10 + digit;

			num = num / 10;
			
		}
		
		if(num1==reverse) {
			System.out.println("palindrome");
		}else {
			System.out.println("no palindrome");
		}
	}
	
}
