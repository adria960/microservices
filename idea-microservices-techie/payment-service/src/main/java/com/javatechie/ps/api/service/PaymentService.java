package com.javatechie.ps.api.service;

import com.javatechie.ps.api.entity.Payment;
import com.javatechie.ps.api.repository.PaymentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Slf4j
@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment) {
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return repository.save(payment);
    }

    public String paymentProcessing() {
        //API should be 3rd party payment gateway (PayPal, PayATM...)
        log.info("Random: {}", (new Random().nextBoolean()));
        return new Random().nextBoolean() ? "success" : "false";
    }

    public Payment findPaymentHistoryByOrderId(int orderId) {
        System.out.println("PaymentService orderId: " + orderId);
        Payment p = repository.findByOrderId(orderId);
        System.out.println("PaymentService Payment: " + p);
        return p;
    }

}
