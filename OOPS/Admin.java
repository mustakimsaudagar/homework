package OOPS;

public class Admin extends User implements Booking {

	Ticket ticket;

    Admin(String name, Ticket ticket) {
        super(name);
        this.ticket = ticket;
    }

    @Override
    void displayRole() {
        System.out.println("Role : Admin");
    }

    @Override
    public void bookTicket() {
        System.out.println(name + " booked ticket OFFLINE");
        System.out.println("Ticket No : " + ticket.getTicketNo());
        System.out.println("Destination : " + ticket.getDestination());
    }

}
