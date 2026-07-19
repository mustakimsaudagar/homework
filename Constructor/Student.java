package Constructor;

public class Student {

	String name;

	int marks;

	public Student(String name, int marks) {

		this.name = name;
		this.marks = marks;
	}

	public void displayresult() {

		System.out.println("Studentname=" + name);
		System.out.println("marks=" + marks);

		if (marks >= 35) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

}
