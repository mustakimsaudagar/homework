package Constructor;

public class Temp {
		
	double celsius ;
	
	public Temp (double celsius) {
		
		this.celsius= celsius ;
		
	}
	
	public void display () {
		
		double Fahrenheit = (celsius * 9 / 5 )+ 32 ;
		
		System.out.println("celsius = "+ celsius );
		System.out.println("fahrenheit = "+Fahrenheit);
	}
	
}
