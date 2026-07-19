package Constructor;

public class Product {
		
	int price ;
	
	public Product (int price) {
		
		this.price = price ;
		
	}
	
	public double display () {
		
		double discount = price -  price*0.10;
		
		
		if (price>1000) {
			return discount;
		}else
			return price ;
	}
	
}
