package Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "passenger_name")
    private Passenger passengerName;

    public Reservation() {}

    public Reservation(Utilisateur utilisateur, Seat seat, Passenger passengerName) {
        this.utilisateur = utilisateur;
        this.seat = seat;
        this.passengerName = passengerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUser() {
        return utilisateur;
    }

    public void setUser(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Passenger getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(Passenger passengerName) {
        this.passengerName = passengerName;
    }
}
