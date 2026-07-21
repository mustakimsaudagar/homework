package Encapsulation;

public class Bank {
	
	private long accountnumber ;
	
	private long balance ;

	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public void deposit (double amount) {
		
		balance+=amount;
		System.out.println("deposit successfully");
		
	}
	
	public void withdraw (double amount) {
		
		if (amount<=balance)
			balance-=amount;

		else 
			
			System.out.println("insufficient balance");
		
		}
	public long getbalance () {
		
		return balance;
		
	}
	
	
	}

