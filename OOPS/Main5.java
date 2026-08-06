package OOPS;

public class Main5 {

    public static void main(String[] args) {

        Slot slot = new Slot();

        slot.setSlotNumber(15);
        slot.setFloor("Ground Floor");

        Car car = new Car("MH12AB1234", slot);

        car.Parkvehicle();
        car.parkingCharge();

        System.out.println("----------------");

        Bike bike = new Bike("MH14XY5678", slot);

        bike.Parkvehicle();
        bike.parkingCharge();

        System.out.println("----------------");

        Truck truck = new Truck("MH20TR9999", slot);

        truck.Parkvehicle();
        truck.parkingCharge();
    }

}
