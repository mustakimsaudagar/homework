package Constructor;

public class EVENODD {
	
	int num ;

	
	public EVENODD (int num) {
		
		this.num= num;

		
	}
	
	public String display () {
		
		if (num%2==0) {
			return "even";
		}else {
			return "odd";
		}
		
		
		
		
	}
	
}
