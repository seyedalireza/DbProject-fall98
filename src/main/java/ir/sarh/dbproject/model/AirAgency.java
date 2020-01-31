package ir.sarh.dbproject.model;

import ir.sarh.dbproject.model.dto.AirAgencyDto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class AirAgency {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String city;

    private String state;

    @ElementCollection
    private List<String> phoneNumbers = new ArrayList<>();

    @ManyToMany
    private List<FlightClass>  flightClasses = new ArrayList<>();

    public AirAgencyDto toDto() {
        return new AirAgencyDto(id, city, state, phoneNumbers, flightClasses.stream()
                .map(FlightClass::toDto).collect(Collectors.toList()));
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<FlightClass> getFlightClasses() {
        return flightClasses;
    }

    public void setFlightClasses(List<FlightClass> flightClasses) {
        this.flightClasses = flightClasses;
    }
}
