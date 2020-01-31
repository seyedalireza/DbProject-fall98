package ir.sarh.dbproject.model;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class FlightClassKey implements Serializable {
    @ManyToOne
    private Flight flight;

    @GeneratedValue
    private Long id;

    public FlightClassKey() {
    }

    public FlightClassKey(Flight flight, Long id) {
        this.flight = flight;
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}