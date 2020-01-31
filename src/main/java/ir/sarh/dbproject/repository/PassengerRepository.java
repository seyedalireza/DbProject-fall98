package ir.sarh.dbproject.repository;

import ir.sarh.dbproject.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
