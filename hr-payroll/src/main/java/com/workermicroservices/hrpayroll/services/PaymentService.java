package com.workermicroservices.hrpayroll.services;

import com.workermicroservices.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerid, Integer days) {
        return new Payment("Bob", 200.0, days);
    }

}
