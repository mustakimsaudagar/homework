package OOPS;

public class Main7 {
	
	public static void main(String[] args) {

        Cart cart = new Cart();

        cart.setItemName("Wireless Mouse");
        cart.setPrice(1000);

        Customer2 customer = new Customer2("Mustakim", cart);

        customer.addtocart();
        customer.calculatediscount();

        System.out.println("----------------------");

        Guest guest = new Guest("Rahul", cart);

        guest.addtocart();
        guest.calculatediscount();
    
}
}
