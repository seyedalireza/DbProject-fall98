package ir.sarh.dbproject.model;

import ir.sarh.dbproject.model.dto.FlightDto;
import ir.sarh.dbproject.model.dto.PlaneDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
public class Flight {
    @Id
    @GeneratedValue
    private Long id;

    private Instant time;

    @ManyToOne
    @NotNull
    private AirPort source;

    @ManyToOne
    @NotNull
    private AirPort dest1;

    @ManyToOne
    private AirPort dest2;

    private Instant dest1ArriveTime;
    private Instant dest2ArriveTime;

    @ManyToOne
    private Plane plane;

    public FlightDto toDto() {
        return new FlightDto(id, time, source.toDto(), dest1.toDto(), dest2.toDto(), dest1ArriveTime, dest2ArriveTime, plane.toDto());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public AirPort getSource() {
        return source;
    }

    public void setSource(AirPort source) {
        this.source = source;
    }

    public AirPort getDest1() {
        return dest1;
    }

    public void setDest1(AirPort dest1) {
        this.dest1 = dest1;
    }

    public AirPort getDest2() {
        return dest2;
    }

    public void setDest2(AirPort dest2) {
        this.dest2 = dest2;
    }

    public Instant getDest1ArriveTime() {
        return dest1ArriveTime;
    }

    public void setDest1ArriveTime(Instant dest1ArriveTime) {
        this.dest1ArriveTime = dest1ArriveTime;
    }

    public Instant getDest2ArriveTime() {
        return dest2ArriveTime;
    }

    public void setDest2ArriveTime(Instant dest2ArriveTime) {
        this.dest2ArriveTime = dest2ArriveTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
