package ticket.booking.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)


public class User {

    private String name;
    private String password;
    @JsonProperty("hashed_passward")  // Map incorrect JSON field
    private String hashPassward;
    private List<Ticket> ticketBooked;
    private String userId;

    public User(String name, String password, String hashPassward, List<Ticket> ticketBooked, String userId){
        this.name= name;
        this.password = password;
        this.hashPassward = hashPassward;
        this.ticketBooked = ticketBooked;
        this.userId = userId;
    }

    public User(){}

    public String getName(){
        return  this.name;
    }

    public String getPassword(){
        return  password;
    }

    public String getHashPassward(){
        return  hashPassward;
    }

    public List<Ticket> getTicketBooked(){
        return  ticketBooked;
    }

    public void printTickets(){
        for(int i = 0; i<ticketBooked.size(); i++){
            System.out.println(ticketBooked.get(i).getTicketInfo());
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  void setHashPassward(String hashPassward){
        this.hashPassward = hashPassward;
    }
    public void setTicketBooked(List<Ticket> ticketBooked){
        this.ticketBooked = ticketBooked;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }
}
