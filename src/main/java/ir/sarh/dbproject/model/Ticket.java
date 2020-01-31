package ir.sarh.dbproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Ticket {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @ManyToOne
    private Passenger passenger;

    @NotNull
    @ManyToOne
    private AirAgency airAgency;

    @NotNull
    @ManyToOne
    private FlightClass flightClass;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public AirAgency getAirAgency() {
        return airAgency;
    }

    public void setAirAgency(AirAgency airAgency) {
        this.airAgency = airAgency;
    }

    public FlightClass getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(FlightClass flightClass) {
        this.flightClass = flightClass;
    }
}
