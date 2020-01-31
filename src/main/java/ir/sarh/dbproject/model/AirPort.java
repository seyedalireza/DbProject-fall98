package ir.sarh.dbproject.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AirPort {

    public enum AirportType {
        INTERNAL, INTERNATIONAL;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String state;

    private String address;

    @Enumerated
    private AirportType type;
}
