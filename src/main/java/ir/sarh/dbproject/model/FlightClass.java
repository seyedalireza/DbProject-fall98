package ir.sarh.dbproject.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FlightClass {

    @EmbeddedId
    private FlightClassKey id;

    private String reception;

    private long price;

    public FlightClassKey getId() {
        return id;
    }

    public void setId(FlightClassKey id) {
        this.id = id;
    }

    public String getReception() {
        return reception;
    }

    public void setReception(String reception) {
        this.reception = reception;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}


