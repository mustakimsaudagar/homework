package Overloadingpoly;

public class Coverts {

	public void convert (double celsius) {
		
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " oC " + fahrenheit + " oF");
		
		
	}
	
	public void convert(double fahrenheit, int choice) {
		
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println(fahrenheit + " °F = " + celsius + " °C");
        
    }

}
