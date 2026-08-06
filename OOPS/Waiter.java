package OOPS;

public class Waiter extends Person implements OrderService {


    Order order;

    Waiter(String name, Order order) {
        super(name);
        this.order = order;
    }

    @Override
    public void takeOrder() {
        System.out.println(name + " took the customer's order.");
    }

    @Override
    void handleOrder() {
        System.out.println("Waiter served Order ID: " + order.getOrderId());
    }

	
}
