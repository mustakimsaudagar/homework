package Constructor;

public class Shopping {
	
	double price ;
	
	double quantity ;
	
	public Shopping (double price , double quantity ) {
		
		this.price = price ;
		this.quantity = quantity ;
		
	}
	
	public double total () {
		
		price = price*quantity;
		
		if (price>5000) {
			return price-(price*0.2);
		}else {
			return price ;
		}
	}
}
