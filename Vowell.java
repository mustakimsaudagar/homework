package homework;

import java.util.Scanner;

public class Vowell {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter alphabet");
		
		char x = sc.next().charAt(0);
		
		switch (x) {
		
		case 'a', 'e' , 'i' , 'o' , 'u' :
			
			System.out.println("this is vowel");
		break;
		
		default :
			System.out.println("this is consonent");
		}
		
		
	}
}
