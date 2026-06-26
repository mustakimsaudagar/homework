package homework;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("enter your operator +, -, *, /, %");
		
		char x = sc.next().charAt(0);
		
		System.out.println("enter your first number");
		
		int a = sc.nextInt();
		
		System.out.println("enter your second number");
		
		int b = sc.nextInt();
		
		switch (x) {
		
		case '+' : 
			
			System.out.println("addition of "+ (a + b ));
			break;
			
		case '-' :
			
			System.out.println("sub of " + (a - b));
			break;
			
		case '*' :
			
			System.out.println("multiply of " + (a*b));
			break;
			
		case '/' :
			
			System.out.println("divided by "+ (a/b));
			break ;
			
			default : {
				System.out.println("not valid");

		}
		
				}
		
		}
	}

