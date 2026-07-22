package Overloadingpoly;

public class Max {

	public String max (int a , int b) {
		
		if (a>b) 
		return "a is largest" ;
		else
		return "b is largest" ;
		
		
	}
	
	public String max (int a , int b , int c) {
		
		if (a>b && a>c)
			return "a is largest";
		else if (b>a && b>c)
			return "b is largest";
		else 
			return "c is largest";
	}
}
