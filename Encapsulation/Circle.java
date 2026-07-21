package Encapsulation;

public class Circle {
	
	private double radius ;
	
	public void setradius (double radius) {
		
		this.radius=radius;
	}
	
	public double area () {
		
		return 3.14 * radius * radius ;
		
	}
	
}
