package Encapsulation;

public class Employee {
	
	private String name ;
	private double salary ;
	
	public void setdata (String n , double s) {
		
		name = n;
		salary = s;
		
	}
	
	public void display () {
		
		System.out.println(name);
		System.out.println(salary);
		
	}
}
