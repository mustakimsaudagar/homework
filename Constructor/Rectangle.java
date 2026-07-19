package Constructor;

public class Rectangle {
		
	double length ;
	double breadth ;
	
	public Rectangle (double length , double breadth) {
		
		this.length = length ;
		this.breadth = breadth ;
		
	}
	
	public void display () {
		
		System.out.println("length= "+ length);
		
		System.out.println("breadth= "+ breadth);
		
		double area = length*breadth;
		
		System.out.println("area = "+area);
	}
	
	
	
	
}
