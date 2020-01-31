package ir.sarh.dbproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
public class Plane {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String model;

    private Instant productionYear;

    private String insurance;

    private int capacity;

    private int maxFlightAllowed;

    @ManyToOne
    private Airline airline;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Instant getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Instant productionYear) {
        this.productionYear = productionYear;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxFlightAllowed() {
        return maxFlightAllowed;
    }

    public void setMaxFlightAllowed(int maxFlightAllowed) {
        this.maxFlightAllowed = maxFlightAllowed;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }
}
