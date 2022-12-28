package com.workermicroservices.hrpayroll.services;

import com.workermicroservices.hrpayroll.entities.Payment;
import com.workermicroservices.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hr-worker.host}") // Conexao com hr-worker
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(Long workerid, Integer days) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerid);

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
