package OOPS;

public class Main3 {

	public static void main(String[] args) {

        Order order = new Order();

        order.setOrderId(101);
        order.setOrderName("Paneer Biryani");

        Waiter waiter = new Waiter("Sofiyan", order);

        waiter.takeOrder();
        waiter.handleOrder();

        System.out.println("----------------------");

        Chef chef = new Chef("MS", order);

        chef.takeOrder();
        chef.handleOrder();
    }

}
