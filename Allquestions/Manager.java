package Allquestions;

public class Manager extends Employee {

	public void manager () {
		
		double bonus = salary*0.25;
		
		salary = salary+bonus;
		
		System.out.println("salary with bonus is = "+salary);
	}
}
