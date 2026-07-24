package Allquestions;

public class Area {

	public void area (double radius ) {
		
		double circle = 3.14*radius*radius;
		
		System.out.println("arrea of circle = "+circle);
	}
	
	public void area (int l, int b,int c) {
		
		int rec = l*b;
		
		System.out.println("arrea of rec = "+rec);
	}
	
	public void area (int base, int height) {
		
		int tri = height*base;
		
		System.out.println("area of triangle = "+tri);
	}


}
