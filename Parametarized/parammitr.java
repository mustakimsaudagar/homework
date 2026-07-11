package Parametarized;

public class parammitr {

	public static void main(String[] args) {
		
		param p = new param () ;
		
		p.name();
		System.out.println("Addition : "+p.add(5, 10));
		System.out.println("evenodd="+p.even_odd(2, 7));
		System.out.println(p.square(9));
		System.out.println("number="+ p.number(9, 6));
	}
}
