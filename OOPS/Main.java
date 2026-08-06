package OOPS;

public class Main {

	public static void main(String[] args) {

        Ticket t = new Ticket();

        t.setTicketNo(101);
        t.setDestination("Mumbai");

        Customer c = new Customer("Mustakim", t);

        c.displayRole();
        c.bookTicket();

        System.out.println("----------------");

        Admin a = new Admin("Ram", t);

        a.displayRole();
        a.bookTicket();
    }

}
