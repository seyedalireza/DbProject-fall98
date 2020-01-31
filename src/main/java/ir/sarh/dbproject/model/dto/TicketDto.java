package ir.sarh.dbproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TicketDto {

    private Long id;

    private PassengerDto passengerDto;

    private AirAgencyDto airAgencyDto;

    private FlightClassDto flightClassDto;

}
