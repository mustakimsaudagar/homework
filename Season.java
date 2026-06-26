package homework;

import java.util.Scanner;

public class Season {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("enter month number");
		
		int a = sc.nextInt();
		
		switch (a) {
		
		case 12,1,2 -> System.out.println("winter");
		case 3,4,5 -> System.out.println("summer");
		case 6,7,8 -> System.out.println("monsoon");
		case 9,10,11 -> System.out.println("autumn");
		
		default -> System.out.println("wrong number");
		
		
		}
		
		
	}

}
