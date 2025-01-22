package com.mipagina.payment_type_service.controller;

import com.mipagina.payment_type_service.model.PaymentType;
import com.mipagina.payment_type_service.service.PaymentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentTypeController {

    @Autowired
    private PaymentTypeService paymentTypeService;

    @PostMapping("/create")
    public String createPaymentId(@RequestBody PaymentType paymentType){
        paymentTypeService.savePaymentType(paymentType);
        return "Payment method created successfully";
    }

    @GetMapping("/bringAll")
    public List<PaymentType> getAllPaymentType(){
        return paymentTypeService.getAllPaymentType();
    }

    @GetMapping("/bring/{paymentId}")
    public PaymentType getPaymentType(@PathVariable Long paymentId){
        return paymentTypeService.getPaymentType(paymentId);
    }

    @PutMapping("/edit/{paymentId}")
    public String editPaymentType(@PathVariable Long paymentId,
                                  @RequestBody PaymentType paymentType){
        paymentTypeService.editPaymentType(paymentId,paymentType);
        return "Payment method edited correctly";
    }

    @DeleteMapping("/delete/{paymentId}")
    public String deletePaymentType(@PathVariable Long paymentId){
        paymentTypeService.deletePaymentType(paymentId);
        return "Payment method deleted correctly";
    }
}
