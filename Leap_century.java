package homework;

public class Leap_century {

	public static void main(String[] args) {
		int year = 2000;
		if(year % 4 == 0) {
			System.out.println("Leap year");
			if(year % 100 ==0) {
				System.out.println("Century year");
			}else {
				System.out.println("not a century  year");
			}
			
		}else {
			System.out.println("Not leap year");
		}
	}
}
