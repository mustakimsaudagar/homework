package Constructor;

public class Max {
	
	int a ;
	int b ;
	int c ;
	
	public Max (int a , int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public void display () {
		
		if (a>b && a>c) {
			System.out.println("a is max");
		}else if (b>c && b>a) {
			System.out.println("b is max");
		}else {
			System.out.println("c is max");
		}
	}
}
