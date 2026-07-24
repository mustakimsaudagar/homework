package Allquestions;

import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter 1st number");

		int a = sc.nextInt();

		System.out.println("enter 2nd number");

		int b = sc.nextInt();

		System.out.println("enter 3rd number");

		int c = sc.nextInt();

		System.out.println("enter 4th number");

		int d = sc.nextInt();

		if (a > b) {
			if (a > c) {
				if (a > d) {
					System.out.println("Highest = " + a);
				} else {
					System.out.println("Highest = " + d);
				}
			} else {
				if (c > d) {
					System.out.println("Highest = " + c);
				} else {
					System.out.println("Highest = " + d);
				}
			}
		} else {
			if (b > c) {
				if (b > d) {
					System.out.println("Highest = " + b);
				} else {
					System.out.println("Highest = " + d);
				}
			} else {
				if (c > d) {
					System.out.println("Highest = " + c);
				} else {
					System.out.println("Highest = " + d);
				}
			}
		}

		

	}
}
