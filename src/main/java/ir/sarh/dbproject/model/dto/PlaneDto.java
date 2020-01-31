package ir.sarh.dbproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlaneDto {

    private Long id;

    private String model;

    private Instant productionYear;

    private String insurance;

    private int capacity;

    private int maxFlightAllowed;

    private AirlineDto airlineDto;

}
