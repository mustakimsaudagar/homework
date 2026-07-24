package Allquestions;

import java.util.Scanner;

public class Menu {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("MENU DETAILS ");
			
			System.out.println("1 CHECK EVEN ODD NUMBER");
			
			System.out.println("2 CHECK PRIME NUMBER ");
			
			System.out.println("3 CHECK REVERSE NUMBER");
			
			System.out.println("ENTER YOUR CHOICE ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			
			case 1 : 
				
				System.out.println("enter a number ");
				
				int num = sc.nextInt();
				
				if (num%2==0) {
					
					System.out.println("even number ");
					
				}else {
					
					System.out.println("odd number ");
				}
				
				break;
				
			case 2 :
				
				System.out.println("enter a number ");
				
				int num1 = sc.nextInt();
				
				int count = 0 ;
				
				for (int i = 1 ; i<=num1 ;i++) {
					
					if (num1%i==0) {
						
						count++;
					}
				}
				
				if (count==2) {
					
					System.out.println("prime number");
				}else {
					
					System.out.println("not a prime number");
				}
					break;
					
			case 3 :
				
				System.out.println("enter a number ");
				
				int num2 = sc.nextInt();
				
				int reverse = 0 ;
				
				while (num2!=0) {
					
					int digit = num2%10 ;
					
					reverse = reverse*10+digit;
					
					num2 = num2/10;
				}
				
				System.out.println(reverse);
					break;
					
					
					default :
						System.out.println("invalid choice");
			
			}
			
			
			
		}
		
		
		
	
}
