package Constructor;

public class Library {

	String bookname ;
	
	boolean isissued ;
	
	public  Library (String bookname , boolean isissued ) {
		
		this.bookname = bookname ;
		this.isissued = isissued ;
	}
	
	public void issued () {
		
		if ( isissued==true) {
			System.out.println("already issued");
		}else {
			System.out.println("available");
		}
	}
	
	public void ruturn () {
		
		if (isissued==true) {
			System.out.println("return book");
		}else {
			System.out.println("not return book");
		}
	}
		
}
