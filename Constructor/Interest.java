package Constructor;

public class Interest {
	
	double principal ;
	double rate ;
	double time ;
	
	public Interest (double principal , double rate , double time) {
		
		this.principal=principal;
		this.rate=rate;
		this.time=time;
		
		
	}
	
	public double display () {
		
		double SI = (principal+rate+time) /100 ;
		
		return SI ;
	}
	
	
}
