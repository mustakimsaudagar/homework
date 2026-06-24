package homework;

public class Age {
	public static void main(String[] args) {
		int age = 20;
		
		if(age <=12 && age >=0) {
			System.out.println("Child");
		}else if (age<=19 && age>=13) {
			System.out.println("Teenager");
		}else if (age<=59 && age>=20) {
			System.out.println("Adult");
		}else if (age<=110 && age>=60) {
			System.out.println("Sinior Citizen");
		}else {
			System.out.println("Wrong Age");
		}
	}
}
