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
}