package Constructor;

public class Reverse {

	int num;

	public Reverse(int num) {

		this.num = num;

	}

	public void display() {

		int reverse = 0;
		while (num > 0) {
			int digit = num % 10;

			reverse = reverse * 10 + digit;

			num = num / 10;
		}

		System.out.println(reverse);
	}
}
