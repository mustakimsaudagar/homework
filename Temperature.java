package homework;

import java.util.Scanner;

public class Temperature {
	
	public Temperature() {
	   }

	   public static void main(String[] var0) {
	      Scanner var1 = new Scanner(System.in);
	      System.out.println("Enter temperture");
	      int var2 = var1.nextInt();
	      if (var2 > 30) {
	         System.out.println("Hot day");
	      } else {
	         System.out.println("Cool day");
	      }

	   }
	   

}
