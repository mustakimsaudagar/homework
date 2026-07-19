package Constructor;

public class Circle {
	
	double radius ;
	
	public Circle (double radius) {
			
		this.radius = radius ;
		
	}
	
	public void display () {
		
		double area = 3.14*radius*radius ;
		System.out.println("area= " + area);
				
		double circumference = 2 * 3.14 * radius ;
		System.out.println("circumference= "+ circumference);
		
	}
	
}
