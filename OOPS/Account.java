package OOPS;

abstract class Account implements Transaction {

	private int pin;
	private double balance;
	
	public Account (int pin , double balance) {
		
		this.pin=pin;
		this.balance=balance;
		
	}
	
	public double getbalance() {
		return balance;
		
	}
	
	public void setbalance(double amount) {
		this.balance=balance;
	}
	
    public void deposit(double amount){

        setbalance(getbalance()+amount);

        System.out.println("Deposited : "+amount);
    }

    public final void security(){

        System.out.println("PIN Verified");
    }

	protected abstract String getAccountNo();

}
