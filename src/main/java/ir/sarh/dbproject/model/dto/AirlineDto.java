package ir.sarh.dbproject.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AirlineDto {

    private Long id;

    private String owner;

    private String name;

}
