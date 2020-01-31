package ir.sarh.dbproject.repository;

import ir.sarh.dbproject.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
