package ir.sarh.dbproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AirAgencyDto {

    private Long id;

    private String city;

    private String state;


    private List<String> phoneNumbers = new ArrayList<>();

    private List<FlightClassDto> flightClassDtos = new ArrayList<>();
}
