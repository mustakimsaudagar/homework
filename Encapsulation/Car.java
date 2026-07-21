package Encapsulation;

public class Car {
	
	private String company ;
	private String model ;
	
	public void setvalues (String c , String m) {
		
		company=c;
		model=m;
		
	}
		
	public void display () {
		
		System.out.println(company);
		System.out.println(model);
		
	}
 	
}
