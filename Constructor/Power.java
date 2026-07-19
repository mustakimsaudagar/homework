package Constructor;

public class Power {

	double base;

	double exponent;

	public Power(double base, double exponent) {

		this.base = base;
		this.exponent = exponent;

	}

	public void display() {

		int result = 1;

		for (int i = 1; i <= exponent; i++) {

			result = (int) (result * base);
		}
		System.out.println("power = " + result);
	}
}
