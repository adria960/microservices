package com.javatechie.ps.api.controller;

import com.javatechie.ps.api.entity.Payment;
import com.javatechie.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) {
        System.out.println("PaymentController orderId: " + orderId);
        Payment p = service.findPaymentHistoryByOrderId(orderId);
        System.out.println("PaymentController Payment: " + p);
        return p;
    }
}
