package ir.sarh.dbproject.repository;

import ir.sarh.dbproject.model.FlightClass;
import ir.sarh.dbproject.model.FlightClassKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightClassRepository extends JpaRepository<FlightClass, FlightClassKey> {
}
