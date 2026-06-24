package homework;

public class Hot_cool_warm_cold {
	
	public static void main(String[] args) {
		int temp = 25;
		
		if(temp >= 50 ) {
			System.out.println("Hot");
		}else if(temp>=20 && temp<50) {
			System.out.println("Warm");
		}else if(temp>=10 && temp<20) {
			System.out.println("Cool");
		}else if(temp<10) {
			System.out.println("Cold");
		}
	}

}
