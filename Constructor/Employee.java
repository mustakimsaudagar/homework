package Constructor;

public class Employee {
		
	String name ;
	int basicsalary ;
	
	public  Employee (String name ,int  basicsalary ) {
		
		this.name = name ;
		this.basicsalary = basicsalary;
		
	}
	
	public double display () {
		
		double salary = basicsalary + (basicsalary  * (0.2)) ;
		
		return salary ;
		
	}
	
	
	
	
	
}
