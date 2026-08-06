package OOPS;

public class ATM {

	public static void main(String[] args) {
		
		Saving s=new Saving(1234,5000);

        s.security();

        s.deposit(1000);

        s.withdraw(4500);

        System.out.println("Balance : "+s.getbalance());

        System.out.println();

        Current c=new Current(5678,2000);

        c.security();

        c.withdraw(6000);

        System.out.println("Balance : "+c.getbalance());
    
	}
}
