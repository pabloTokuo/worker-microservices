package com.workermicroservices.hrpayroll.services;

import com.workermicroservices.hrpayroll.entities.Payment;
import com.workermicroservices.hrpayroll.entities.Worker;
import com.workermicroservices.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerid, Integer days) {
        Worker worker = workerFeignClient.findById(workerid).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
