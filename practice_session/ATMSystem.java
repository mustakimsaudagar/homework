package practice_session;

public class ATMSystem {

	long balance = 5000;

	public long checkBalance() {

		return balance;

	}

	public void Withdraw(long a) {

		if (balance < a) {
			System.out.println("insuffient balance");
		} else {

			balance -= a;
			System.out.println("succesfull withdraw your current balance is " + balance);
		}
	}
}
