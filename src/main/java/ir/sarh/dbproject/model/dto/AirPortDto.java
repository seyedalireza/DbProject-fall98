package ir.sarh.dbproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AirPortDto {

    public enum AirportType {
        INTERNAL, INTERNATIONAL;
    }

    private Long id;

    private String city;

    private String state;

    private String address;

    private AirportType type;
}
