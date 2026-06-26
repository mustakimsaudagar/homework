package homework;

import java.util.Scanner;

public class Bill {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("enter category type");
		
		String name = sc.next();
		
		switch (name) {
		
		case "doemstic" -> System.out.println("5 rs per unit");
		
		case "Commercial" -> System.out.println("10 rs per unit");
		
		case "Industrial" -> System.out.println("15 rs per unit");
		
		default -> System.out.println("WRONG CATEGORY");
			
			
		}
			
		
		
		
	}
	

}
