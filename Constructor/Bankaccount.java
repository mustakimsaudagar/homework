package Constructor;

public class Bankaccount {
		
	long Accountnumber ;
	long Balance ;
	
	public Bankaccount (long Accountnumber , long Balance ) {
		
		this.Accountnumber = Accountnumber ;
		this.Balance = Balance ;
		
	}
	
	public void Withdraw () {
		
		int withdraw = 1 ;
		
		if (withdraw >Balance) {
			System.out.println("insufficient balance");
		}else {
			System.out.println("succeessfully payment done " );
			System.out.println(Balance-=withdraw);
		}
		System.out.println(Balance);
			
		
	}
public void deposit () {
		
		int dep = 100 ;
		
		Balance+=dep;
		System.out.println(Balance);

	}
}
