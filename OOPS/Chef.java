package OOPS;

public class Chef extends Person implements OrderService{

	Order order;

    Chef(String name, Order order) {
        super(name);
        this.order = order;
    }

    @Override
    public void takeOrder() {
        System.out.println(name + " received the order.");
    }

    @Override
    void handleOrder() {
        System.out.println("Chef is preparing: " + order.getOrderName());
    }

}
