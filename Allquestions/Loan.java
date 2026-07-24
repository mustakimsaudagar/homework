package Allquestions;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter salary");
		
		double salary = sc.nextDouble();
		
		System.out.println("enter age");
		
		int age = sc.nextInt();
		
		if (salary>25000 && age>20 && age<61) {
			
			System.out.println("eligible for loan");
		}else {
			
			System.out.println("not eligible for loan");
		}
		
		
	}
}
