package OOPS;

public class Customer2 extends User5 implements CarOperations {

	Cart cart;

    Customer2(String name, Cart cart) {
        super(name);
        this.cart = cart;
    }

    public void addtocart() {
        System.out.println(name + " added " + cart.getItemName() + " to the cart.");
    }

    void calculatediscount() {

        double discount = cart.getPrice() * 0.10;
        
        double finalPrice = cart.getPrice() - discount;

        System.out.println("Customer Discount = 10%");
        
        System.out.println("Final Price = ₹" + finalPrice);
    }

}
