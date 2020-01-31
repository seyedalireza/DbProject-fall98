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
public class FlightDto {

    private Long id;

    private Instant time;

    private AirPortDto source;

    private Instant outTime;

    private AirPortDto dest1;

    private AirPortDto dest2;

    private Instant dest1ArriveTime;
    private Instant dest2ArriveTime;

    private PlaneDto planeDto;

}
