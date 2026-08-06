package OOPS;

public class Student extends User1 implements IssueBook {
	
    Book book;

    Student(String name, Book book) {
        super(name);
        this.book = book;
    }

    @Override
    public void issueBook() {
        System.out.println(name + " issued the book.");
        System.out.println("Book ID : " + book.getBookid());
        System.out.println("Book Name : " + book.getBookName());
    }

    @Override
    void calculateFine() {
        System.out.println("Student Fine = ₹10 per day");
    }

}
