package ir.sarh.dbproject.repository;

import ir.sarh.dbproject.model.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirLineRepository extends JpaRepository<Airline, Long> {
}
