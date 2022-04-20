package wc;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;
import java.util.ArrayList;

@Entity
@Table(name = "concert")
public class Concert {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "concert_id")
    private int concertId;
    @Basic
    @Column(name = "artist_name")
    private String artistName;
    @Basic
    @Column(name = "concert_date")
    private Date concertDate;
    @Basic
    @Column(name = "ticket_price")
    private double ticketPrice;
    @Basic
    @Column(name = "arena_id")
    private int arenaId;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Collection<Customer> customers = new ArrayList<>();

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Collection<Customer> customers) {
        this.customers = customers;
    }
    public int getConcertId() {
        return concertId;
    }

    public void setConcertId(int concertId) {
        this.concertId = concertId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Date getConcertDate() {
        return concertDate;
    }

    public void setConcertDate(Date concertDate) {
        this.concertDate = concertDate;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getArenaId() {
        return arenaId;
    }

    public void setArenaId(int arenaId) {
        this.arenaId = arenaId;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "concertId=" + concertId +
                ", artistName='" + artistName + '\'' +
                ", concertDate=" + concertDate +
                ", ticketPrice=" + ticketPrice +
                ", arenaId=" + arenaId +
                '}';
    }
}

