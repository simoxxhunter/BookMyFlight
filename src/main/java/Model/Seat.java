package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seatNumber;
    private String conditionSeat;

    @ManyToOne
    @JoinColumn(name = "vol_id")
    private Vol vol;

    // Constructors, getters, and setters
    public Seat() {}

    public Seat(String seatNumber, String conditionSeat, Vol vol) {
        this.seatNumber = seatNumber;
        this.conditionSeat = conditionSeat;
        this.vol = vol;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getConditionSeat() {
        return conditionSeat;
    }

    public void setConditionSeat(String conditionSeat) {
        this.conditionSeat = conditionSeat;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }
}
