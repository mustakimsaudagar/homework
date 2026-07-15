package practice_session;

public class library {

	public void issueBook(String bookName, boolean isAvailable) {
		
		if (isAvailable==true) {
			System.out.println("u can issue book");
		}else {
			System.out.println("out of stock");
		}
	}
}
