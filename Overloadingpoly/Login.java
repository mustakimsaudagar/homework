package Overloadingpoly;

public class Login {

	public String login (String name) {
		
		if (name=="ms") 
			return "login successfuly";
			else
				return "login invalid";
			
		}
		
		public void login (String name , String password) {
			
			if (name=="ms" && password=="ms123")
				
				System.out.println("login successfull");
						
				else 
					
					System.out.println("login unsuccesfull");
		}
		
	}

