package homework;

import java.util.Scanner;

public class Gradeinput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		
		 
		 System.out.println("enter your grade");
		 
		 char grade = sc.next().charAt(0);

		 
		 switch (grade) {
		 
		 case 'A'  :
			 
			 System.out.println("excellent , you got A grade ");
			 break;
			 
		 case 'B' :
			 
			 System.out.println("very good , you got B grade ") ;
			 break;
			 
		 case 'C' :
			 System.out.println("Average , you got C grade ");
			 break;
			 
		 case 'D' :
			 System.out.println("poor , you got D grade ");
			 break;
			 
		 case 'F' :
			 System.out.println("fail , you got F grade");
			 break;
			 
			 default :
				 
				 System.out.println("you select wrong char");
		 }
		 
	}

}
