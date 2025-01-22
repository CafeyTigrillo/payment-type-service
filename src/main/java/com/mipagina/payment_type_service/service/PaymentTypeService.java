package com.mipagina.payment_type_service.service;

import com.mipagina.payment_type_service.model.PaymentType;
import com.mipagina.payment_type_service.repository.IPaymentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentTypeService implements IPaymentTypeService{

    @Autowired
    private IPaymentTypeRepository paymentTypeRepository;

    @Override
    public List<PaymentType> getAllPaymentType() {
        return paymentTypeRepository.findAll();
    }

    @Override
    public PaymentType getPaymentType(Long paymentId) {
        return paymentTypeRepository.findById(paymentId).orElse(null);
    }

    @Override
    public void savePaymentType(PaymentType paymentType) {
        paymentTypeRepository.save(paymentType);
    }

    @Override
    public void editPaymentType(Long paymentId, PaymentType paymentType) {
        paymentTypeRepository.findById(paymentId);
        PaymentType paymentType1=new PaymentType();
        paymentType1.setPaymentId(paymentId);
        paymentType1.setPaymentType(paymentType.getPaymentType());
        this.savePaymentType(paymentType1);
    }

    @Override
    public void deletePaymentType(Long paymentId) {
        paymentTypeRepository.deleteById(paymentId);
    }
}
