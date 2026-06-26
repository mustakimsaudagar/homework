package homework;

import java.util.Scanner;

public class Signal {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("enter colour name ");
		
		String clr = sc.next();
		
		switch (clr) {
		
		case "red" :
			System.out.println("stop");
			break;
			
		case "yellow" :
			System.out.println("Ready");
			break;
			
		case "green" :
			System.out.println("Go");
			break;
			
		default :
			System.out.println("invalid colour");
 		}
		
		
		
	}
}
