package ir.sarh.dbproject.repository;

import ir.sarh.dbproject.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
