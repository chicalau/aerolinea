package Models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToMany(mappedBy="ticketBaggage", fetch=FetchType.EAGER)
    private Set<Baggage> baggages = new HashSet<>();

    private String reservationCode;

    private long ticketnumber;

    private double totalPrice;

    private boolean isActive;

    public Ticket(){};

    public Ticket(String reservationCode, long ticketnumber, double totalPrice, boolean isActive ) {
        this.reservationCode = reservationCode;
        this.ticketnumber = ticketnumber;
        this.totalPrice = totalPrice;
        this.isActive = true;
    }

    public long getId() {
        return id;
    }
    public String getReservationCode() {
        return reservationCode;
    }
    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public long getTicketnumber() {
        return ticketnumber;
    }
    public void setTicketnumber(long ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
}
