package ir.sarh.dbproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FlightClassDto {

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Key implements Serializable {
        private FlightDto flightDto;

        @GeneratedValue
        private Long id;
    }

    private Key id;

    private String reception;

    private long price;

}


