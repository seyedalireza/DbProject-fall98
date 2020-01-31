package ir.sarh.dbproject.controller;

import ir.sarh.dbproject.model.dto.*;
import ir.sarh.dbproject.service.AirAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RequestMapping("/api/v1/air-agency")
@RestController
public class RestApi {

    private AirAgencyService airAgencyService;

    @Autowired
    public RestApi(AirAgencyService airAgencyService) {
        this.airAgencyService = airAgencyService;
    }

    @PutMapping("/passenger")
    public void addPassenger(PassengerDto dto) {
        airAgencyService.addPassenger(dto);
    }

    @PutMapping("/passenger/all")
    public List<PassengerDto> getAllPassengers() {
        return airAgencyService.getAllPassengers();
    }

    @PutMapping("/airline")
    public void addAirline(AirlineDto dto) {
        airAgencyService.addAirline(dto);
    }

    @GetMapping("/airport/all")
    public List<AirlineDto> getAllAirline() {
        return airAgencyService.getAllAirline();
    }

    @PutMapping("/airport")
    public void addAirPort(AirPortDto dto) {
        airAgencyService.addAirPort(dto);
    }

    @GetMapping("/airport")
    public List<AirlineDto> getAllAirport() {
        return airAgencyService.getAllAirport();
    }

    @PutMapping("/plane")
    public void addPlane(PlaneDto dto) {
        airAgencyService.addPlane(dto);
    }

    @GetMapping("/plane")
    public List<PlaneDto> getAllPlane() {
        return airAgencyService.getAllPlane();
    }

    @PutMapping("/flight")
    public void addFlight(FlightDto dto) {
        airAgencyService.addFlight(dto);
    }

    @GetMapping("/flight/all")
    public List<FlightDto> getAllFlights() {
        return airAgencyService.getAllFlights();
    }

    @PutMapping("/airagency")
    public void addAirAgency(AirAgencyDto dto) {
        airAgencyService.addAirAgency(dto);
    }

    @GetMapping("/airagency/all")
    public List<AirAgencyDto> getAllAirAgencies() {
        return airAgencyService.getAllAirAgencies();
    }

    @PutMapping("/flightclass")
    public void addFlightClass(FlightClassDto flightDto) {
        airAgencyService.addFlightClass(flightDto);
    }

    @GetMapping("/flightclass/all")
    public List<FlightClassDto> getAllFlightClasses() {
        return airAgencyService.getAllFlightClasses();
    }

    @PutMapping("/flightclass-airagency")
    public void addFlightClassToAirAgency(FlightClassDto flightDto, AirAgencyDto dto) {
        airAgencyService.addFlightClassToAirAgency(flightDto, dto);
    }

    @PutMapping("/ticket")
    public void addTicket(TicketDto dto) {
        airAgencyService.addTicket(dto);
    }

    @GetMapping("/ticket/all")
    public List<TicketDto> getAllTicket() {
        return airAgencyService.getAllTicket();
    }
}


