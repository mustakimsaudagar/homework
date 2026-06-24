package homework;

import java.util.Scanner;

public interface DivisibleBy10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterr number");
		int num = sc.nextInt();
		if(num%10==0) {
			System.out.println("number is divisible by 10");
		}else {
			System.out.println("number is not divisible by 10");
		}
		
	}

}
