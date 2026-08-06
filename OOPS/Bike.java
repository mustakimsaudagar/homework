package OOPS;

public class Bike extends Vehicle implements Parking {

    Slot slot;

    Bike(String vehicleNumber, Slot slot) {
        super(vehicleNumber);
        this.slot = slot;
    }

    @Override
    public void Parkvehicle() {
        System.out.println("Bike Parked");
        System.out.println("Vehicle No : " + vehiclenumber);
        System.out.println("Slot No : " + slot.getSlotNumber());
    }

    @Override
    void ParkingCharge() {
        System.out.println("Bike Parking Charge = ₹50");
    }
}

