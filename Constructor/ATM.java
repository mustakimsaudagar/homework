package Constructor;

public class ATM {
	
	double balance ;
	double withdraw;
	double deposit ;
	
	public ATM (long balance, double withdraw, double deposit ) {
		
		this.balance = balance ;
		this.withdraw = withdraw ;
		this.deposit = deposit;
		
	}
	
	 public String withdraw () {
		 
		 
		 if (withdraw>balance) {
			 return "Insufficient";
		 }else {
			 balance-=withdraw;
			 return "Successful";
		 }
		 

	 }
	 
	 public void deposit () {
		 
		 balance = balance + deposit ;
		 
		 System.out.println("your current balance is = "+balance);
		 
	 }
	 
	 public double balance () {
		 
		 return balance ;
	 }
	 
	
	
}
