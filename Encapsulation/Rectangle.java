package Encapsulation;

public class Rectangle {
	
	private double length ;
	private double breadth ;
	
	public void setvalues (double l , double b) {
		
		this.length= l;
		this.breadth=b;
		
	}
	
	public double area () {
		
		return length*breadth;
		
	}
}
