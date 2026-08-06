package OOPS;

public class Current extends Account {
	
    public Current(int pin,double balance){

        super(pin,balance);
    }

    
    public void withdraw(double amount){

        if(getbalance()-amount>=-5000){

            setbalance(getbalance()-amount);

            System.out.println("Withdrawal Successful");
        }

        else{

            System.out.println("Limit Exceeded");
        }
    }

}
