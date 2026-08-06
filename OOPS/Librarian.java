package OOPS;

public class Librarian extends User1 implements IssueBook{
		
	Book book;

    Librarian(String name, Book book) {
        super(name);
        this.book = book;
    }

    @Override
    public void issueBook() {
        System.out.println(name + " approved the book issue.");
        System.out.println("Book ID : " + book.getBookid());
        System.out.println("Book Name : " + book.getBookName());
    }

    @Override
    void calculateFine() {
        System.out.println("Librarian Fine = No Fine");
    }
}

