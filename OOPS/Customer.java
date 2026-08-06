package OOPS;

public class Customer extends User implements Booking {
	
    Ticket ticket;

    Customer(String name, Ticket ticket) {
        super(name);
        this.ticket = ticket;
    }

    @Override
    void displayRole() {
        System.out.println("Role : Customer");
    }

    @Override
    public void bookTicket() {
        System.out.println(name + " booked ticket ONLINE");
        System.out.println("Ticket No : " + ticket.getTicketNo());
        System.out.println("Destination : " + ticket.getDestination());
    }

}
