package Constructor;

public class Prime {
	
	int num ;
	
	public Prime ( int num ) {
		
		this.num = num ;
		
	}
	
	public void prime () {
		
		int i = 1;
		int count = 0;
		
		for (i=1; i<=num; i++) {
			
			if (num%i==0) 
				
			count ++ ;
			
		}
		
		if (count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}
	}
}
