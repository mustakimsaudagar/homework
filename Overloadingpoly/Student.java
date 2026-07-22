package Overloadingpoly;

public class Student {

	public void constructor (int a , String b , double c) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	public int constructor (int a ) {
		
		return a ;
		
	}
	
	public void constructor (int a , String b) {
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
