package Constructor;

public class Electricity {
	
	int units ;
	
	public Electricity (int units) {
		
		this.units = units ;
		
	}
	
	public void bill () {
		
		if (units<=100) {
			System.out.println("5 rs per unit");
		}else if (units<=200) {
			System.out.println("7 rs per units");
		}else if (units<=201) {
			System.out.println("10 rs per units");
		}else {
			System.out.println(" ");
		}
	}
}
