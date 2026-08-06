package OOPS;

public class Guest extends User5 implements CarOperations {
	
    Cart cart;

    Guest(String name, Cart cart) {
        super(name);
        this.cart = cart;
    }

    @Override
    public void addtocart() {
        System.out.println(name + " added " + cart.getItemName() + " to the cart.");
    }

    @Override
    void calculatediscount() {

        System.out.println("Guest Discount = 0%");
        System.out.println("Final Price = ₹" + cart.getPrice());
    }

}
