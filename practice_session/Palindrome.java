package practice_session;

public class Palindrome {
	
	public boolean isPalindrome(int num) {
			
		int reverse =0;
		int num1 = num;
		
		while ( num>0) {
			
			reverse = reverse*10 + (num%10);
			
			num = num/10;
			
		}
		if(num1 == reverse) {
			return true;
		}else {
			return false;
		}
	}
}
