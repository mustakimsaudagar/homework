package practice_session;

public class Empoyeesalary {

	public void calculateSalary(double basic) {

		double hra_salary = (basic * 0.10) + basic;

		double da_salary = (basic * 0.20) + basic;

		System.out.println("hra salary is " + hra_salary);

		System.out.println("da salary is " + da_salary);

	}
}
