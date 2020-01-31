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
public class PassengerDto {

    private Long id;

    private String name;

    private String familyName;

    private String phoneNumber;

    private String email;

    private Instant birthDay;

}
