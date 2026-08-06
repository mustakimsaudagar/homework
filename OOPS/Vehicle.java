package OOPS;

 abstract class Vehicle {

	String vehiclenumber ;
	
	Vehicle (String vehiclenumber) {
		
		this.vehiclenumber=vehiclenumber;
	}
	
	abstract void ParkingCharge();
}
