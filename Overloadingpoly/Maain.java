package Overloadingpoly;

public class Maain {

	
	public static void main(String[] args) {
		
		System.out.println("i am main method");
		
		main(10);
		main("ms");
		
	}
	
	public static void main(int num) {
		
		System.out.println(num);
		
	}
	
	public static void main (String name) {
		
		System.out.println(name);
	}
	
	
}
