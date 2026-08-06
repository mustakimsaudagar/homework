package OOPS;

public class Main1 {

	public static void main(String[] args) {

        Book b = new Book();

        b.setBookid(252);
        b.setBookName("Rich dad Poor dad");

        Student s = new Student("Mustakim", b);

        s.issueBook();
        s.calculateFine();

        System.out.println("---------------------------------------------------");

        Librarian l = new Librarian("Isa", b);

        l.issueBook();
        l.calculateFine();
    }

}
