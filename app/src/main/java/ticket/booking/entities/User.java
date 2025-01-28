package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String userId;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;

    // Constructor
    public User(){}

    public User(String name, String password, String hashedPassword, List<Ticket> ticketsBooked, String userId){
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
    }

    // Getter's
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public void printTickets(){
        for( int i = 0; i < ticketsBooked.size();i++){
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }

    public String getUserId() {
        return userId;
    }


    // Setter's
    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}

