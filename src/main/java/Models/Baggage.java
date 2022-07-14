package Models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Baggage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private double weight;

    private BaggageType typo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="ticket")
    private Ticket ticketBaggage;

    private double price;

    public Baggage (){};

    public Baggage(double weight, BaggageType typo, double price, Ticket ticketBaggage) {
        this.weight = weight;
        this.typo = typo;
        this.price = price;
        this.ticketBaggage = ticketBaggage;
    }

    public long getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BaggageType getTypo() {
        return typo;
    }
    public void setTypo(BaggageType typo) {
        this.typo = typo;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Ticket getTicket() {
        return ticketBaggage;
    }
    public void setTicket(Ticket ticket) {
        this.ticketBaggage = ticket;
    }




}
