package ir.sarh.dbproject.service;

import ir.sarh.dbproject.model.*;
import ir.sarh.dbproject.model.dto.*;
import ir.sarh.dbproject.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AirAgencyService {

    private AirAgencyRepository agencyRepository; // after flight class
    private AirLineRepository airLineRepository;
    private AirPortRepository airPortRepository;
    private FlightClassRepository flightClassRepository;
    private FlightRepository flightRepository;
    private PassengerRepository passengerRepository;
    private PlaneRepository planeRepository;
    private TicketRepository ticketRepository;

    @Autowired
    public AirAgencyService(AirAgencyRepository agencyRepository, AirLineRepository airLineRepository,
                            AirPortRepository airPortRepository, FlightClassRepository flightClassRepository,
                            FlightRepository flightRepository, PassengerRepository passengerRepository,
                            PlaneRepository planeRepository, TicketRepository ticketRepository) {
        this.agencyRepository = agencyRepository;
        this.airLineRepository = airLineRepository;
        this.airPortRepository = airPortRepository;
        this.flightClassRepository = flightClassRepository;
        this.flightRepository = flightRepository;
        this.passengerRepository = passengerRepository;
        this.planeRepository = planeRepository;
        this.ticketRepository = ticketRepository;
    }

    public void addPassenger(PassengerDto dto) {
        Passenger passenger = new Passenger();
        passenger.setBirthDay(dto.getBirthDay());
        passenger.setEmail(dto.getEmail());
        passenger.setFamilyName(dto.getFamilyName());
        passenger.setName(dto.getName());
        passenger.setId(dto.getId());
        passenger.setPhoneNumber(dto.getPhoneNumber());
        passengerRepository.save(passenger);
    }

    public List<PassengerDto> getAllPassengers() {
        return passengerRepository.findAll().stream().map(Passenger::toDto).collect(Collectors.toList());
    }

    public void addAirline(AirlineDto dto) {
        Airline airline = new Airline();
        airline.setName(dto.getName());
        airline.setId(dto.getId());
        airline.setName(dto.getOwner());
        airLineRepository.save(airline);
    }

    public List<AirlineDto> getAllAirline() {
        return airLineRepository.findAll().stream().map(Airline::toDto).collect(Collectors.toList());
    }

    public void addAirPort(AirPortDto dto) {
        AirPort airPort = new AirPort();
        airPort.setAddress(dto.getAddress());
        airPort.setCity(dto.getCity());
        airPort.setId(dto.getId());
        airPort.setState(dto.getState());
        airPort.setType(dto.getType());
        airPortRepository.save(airPort);
    }

    public List<AirlineDto> getAllAirport() {
        return airLineRepository.findAll().stream().map(Airline::toDto).collect(Collectors.toList());
    }

    public void addPlane(PlaneDto dto) {
        Plane plane = new Plane();
        plane.setCapacity(dto.getCapacity());
        plane.setInsurance(dto.getInsurance());
        plane.setId(dto.getId());
        plane.setMaxFlightAllowed(dto.getMaxFlightAllowed());
        plane.setModel(dto.getModel());
        plane.setProductionYear(dto.getProductionYear());
        Optional<Airline> airline = airLineRepository.findById(dto.getId());
        plane.setAirline(airline.get());
        planeRepository.save(plane);
    }

    public List<PlaneDto> getAllPlane() {
        return planeRepository.findAll().stream().map(Plane::toDto).collect(Collectors.toList());
    }

    public void addFlight(FlightDto dto) {
        Flight flight = new Flight();
        flight.setTime(dto.getTime());
        flight.setDest1ArriveTime(dto.getDest1ArriveTime());
        flight.setDest2ArriveTime(dto.getDest2ArriveTime());
        Optional<AirPort> des1 = airPortRepository.findById(dto.getDest1().getId());
        Optional<AirPort> des2 = airPortRepository.findById(dto.getDest2().getId());
        Optional<AirPort> source = airPortRepository.findById(dto.getSource().getId());
        if (des2.isPresent()) {
            flight.setDest2(des2.get());
        }
        flight.setDest1(des1.get());
        flight.setSource(source.get());
        Optional<Plane> plane = planeRepository.findById(dto.getPlaneDto().getId());
        flight.setPlane(plane.get());
        flight.setId(dto.getId());
        flightRepository.save(flight);
    }

    public List<FlightDto> getAllFlights() {
        return flightRepository.findAll().stream().map(Flight::toDto).collect(Collectors.toUnmodifiableList());
    }

    public void addAirAgency(AirAgencyDto dto) {
        AirAgency airAgency = new AirAgency();
        airAgency.setCity(dto.getCity());
        airAgency.setId(dto.getId());
        airAgency.setPhoneNumbers(dto.getPhoneNumbers());
        airAgency.setState(dto.getState());
        agencyRepository.save(airAgency);
    }

    public List<AirAgencyDto> getAllAirAgencies() {
        return agencyRepository.findAll().stream().map(AirAgency::toDto).collect(Collectors.toList());
    }

    public void addFlightClass(FlightClassDto flightDto) {
        FlightClass flightClass = new FlightClass();
        flightClass.setId(new FlightClassKey(flightRepository.getOne(flightDto.getId().getFlightDto().getId()), null));
        flightClass.setPrice(flightDto.getPrice());
        flightClass.setReception(flightDto.getReception());
        flightClassRepository.save(flightClass);
    }

    public List<FlightClassDto> getAllFlightClasses() {
        return flightClassRepository.findAll().stream().map(FlightClass::toDto).collect(Collectors.toList());
    }

    public void addFlightClassToAirAgency(FlightClassDto flightDto, AirAgencyDto dto) {
        agencyRepository.getOne(dto.getId()).getFlightClasses().add(flightClassRepository
                .getOne(new FlightClassKey(flightRepository.getOne(flightDto.getId().getFlightDto().getId()),
                        flightDto.getId().getId())));
    }

    public void addTicket(TicketDto dto) {
        Long airAgencyId = dto.getAirAgencyDto().getId();
        FlightClassDto.Key id = dto.getFlightClassDto().getId();
        Flight flight = flightRepository.getOne(id.getFlightDto().getId());
        Ticket ticket = new Ticket();
        ticket.setId(dto.getId());
        ticket.setAirAgency(agencyRepository.getOne(airAgencyId));
        ticket.setFlightClass(flightClassRepository.getOne(new FlightClassKey(flight, id.getId())));
        ticket.setPassenger(passengerRepository.getOne(dto.getPassengerDto().getId()));
        ticketRepository.save(ticket);
    }

    public List<TicketDto> getAllTicket() {
        return ticketRepository.findAll().stream().map(Ticket::toDto).collect(Collectors.toList());
    }
}
