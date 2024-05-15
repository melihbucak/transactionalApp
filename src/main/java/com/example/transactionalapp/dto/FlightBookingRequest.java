package com.example.transactionalapp.dto;

import com.example.transactionalapp.entity.PassengerInfo;
import com.example.transactionalapp.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mbucak on 15.05.2024 11:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;
}
