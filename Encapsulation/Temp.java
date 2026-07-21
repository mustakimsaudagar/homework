package Encapsulation;

public class Temp {
	
	private double celcius ;
	
	public void setvalues (double c) {
		
		celcius=c;
		
	}
	
	public double fahrenheit () {
		
		return  (celcius * 9 / 5) + 32 ;
		
	}
}
