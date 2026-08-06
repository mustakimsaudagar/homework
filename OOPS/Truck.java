package OOPS;

public class Truck extends Vehicle implements Parking {

	Slot slot;

    Truck(String vehicleNumber, Slot slot) {
        super(vehicleNumber);
        this.slot = slot;
    }

    @Override
    public void Parkvehicle() {
        System.out.println("Truck Parked");
        System.out.println("Vehicle No : " + vehiclenumber);
        System.out.println("Slot No : " + slot.getSlotNumber());
    }

    @Override
    void ParkingCharge() {
        System.out.println("Truck Parking Charge = ₹200");
    }

}
