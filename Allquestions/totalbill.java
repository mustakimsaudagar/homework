package Allquestions;

public class totalbill {

	String product = "samosa";

	int price = 5001;

	int quantity = 10;

	int bill = price * quantity;

	public void a() {

		if (bill > 5000) {

			double discount = bill * 0.10;

			System.out.println("bill= " + (bill - discount));
		}

		else {
			System.out.println("bill= " + bill);
		}

	}

}