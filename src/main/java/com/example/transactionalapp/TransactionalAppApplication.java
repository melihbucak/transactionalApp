package com.example.transactionalapp;

import com.example.transactionalapp.dto.FlightBookingAcknowledgement;
import com.example.transactionalapp.dto.FlightBookingRequest;
import com.example.transactionalapp.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class TransactionalAppApplication {

    @Autowired
    private FlightBookingService service;


    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
        return service.bookFlightTicket(request);
    }

    public static void main(String[] args) {
        SpringApplication.run(TransactionalAppApplication.class, args);
    }
}
