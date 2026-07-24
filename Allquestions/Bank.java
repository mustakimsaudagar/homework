package Allquestions;

public class Bank {

	private double balance;

//	private int amount;
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	

	public void deposit(double amount) {

		 balance += amount;

		System.out.println("you have deposited =  " + amount + "total balance = " + balance);

	}

	public void withdraw(double amount) {

		 balance -= amount;

		System.out.println("u have withdraw = " + amount + "total balance = " + balance);

		System.out.println(balance);
	}
	
	public void getbalance() {
		
		System.out.println("total balance = "+ balance);
	}

}
