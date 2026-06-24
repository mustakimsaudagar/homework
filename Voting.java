package homework;

public class Voting {
	public static void main(String[] args) {
		int age = 27;
		if(age >= 18 && age<110) {
			System.out.println("Elegible for vote");
			if(age>=25) {
				System.out.println("You can contest in elections");
			}
		} else if(age >=0 && age <18 ) {
			System.out.println("Not elegible for vote");
		}
	}
}
