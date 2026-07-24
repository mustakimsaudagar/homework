package Allquestions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter operation ");

		char operation = sc.next().charAt(0);

		System.out.println("enter first number");

		int a = sc.nextInt();

		System.out.println("enter second number");

		int b = sc.nextInt();

		switch (operation) {

		case '+':
			System.out.println(a + b);
			break;

		case '-':
			System.out.println(a - b);
			break;

		case '*':
			System.out.println(a * b);
			break;

		case '/':
			System.out.println(a / b);
			break;

		default:
			System.out.println("invalid activity");

		}
	}
}
