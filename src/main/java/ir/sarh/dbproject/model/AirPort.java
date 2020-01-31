package ir.sarh.dbproject.model;

import ir.sarh.dbproject.model.dto.AirPortDto;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AirPort {

    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String state;

    private String address;

    @Enumerated
    private AirPortDto.AirportType type;

    public AirPortDto toDto() {
        return new AirPortDto(id, city, state, address, type);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AirPortDto.AirportType getType() {
        return type;
    }

    public void setType(AirPortDto.AirportType type) {
        this.type = type;
    }
}
