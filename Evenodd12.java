package homework;

import java.util.Scanner;

public class Evenodd12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("enter number");
		
		
		int num = sc.nextInt();
		
		switch (num %2) { 
		
		case 0 : 
		
		System.out.println("thid is even number");
		break;
		
		default :
			
			System.out.println("this is odd number");
		}
		
	}
}
