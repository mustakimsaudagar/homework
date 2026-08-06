package OOPS;

public class Saving extends Account {
	
	public Saving (int pin , double balance) {
		
		super(pin,balance);
		
	}
	
	public void withdraw (double amount) {
		
        if(getbalance()-amount>=-5000){

            setbalance(getbalance()-amount);

            System.out.println("Withdrawal Successful");
        }

        else{

            System.out.println("Limit Exceeded");
        }
    
	}
}
