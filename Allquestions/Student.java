package Allquestions;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter student name ");

		String name = sc.next();

		System.out.println("enter student marks");

		int marks = sc.nextInt();
		int marks1 = sc.nextInt();
		int marks2 = sc.nextInt();

		int average = (marks+marks1+marks2)/3;

		System.out.println("your average marks are " + average);

		if (average > 75) {

			System.out.println("A");
		}

		else if (average > 60 && average <= 75) {

			System.out.println("B");
		}

		else if (average >= 40 && average <= 60) {

			System.out.println("C");
		}

		else {

			System.out.println("F");
		}

	}

}
