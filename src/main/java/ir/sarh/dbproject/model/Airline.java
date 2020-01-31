package ir.sarh.dbproject.model;

import ir.sarh.dbproject.model.dto.AirlineDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Airline {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String owner;

    @NotNull
    private String name;

    public AirlineDto toDto() {
        return new AirlineDto(id, owner, name);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
