package OOPS;

public class Car extends Vehicle implements Parking {
	
	Slot slot;

    Car(String vehicleNumber, Slot slot) {
        super(vehicleNumber);
        this.slot = slot;
    }

    @Override
    public void Parkvehicle() {
        System.out.println("Car Parked");
        System.out.println("Vehicle No : " + vehiclenumber);
        System.out.println("Slot No : " + slot.getSlotNumber());
    }

    @Override
    void ParkingCharge() {
        System.out.println("Car Parking Charge = ₹100");
    	}
}

