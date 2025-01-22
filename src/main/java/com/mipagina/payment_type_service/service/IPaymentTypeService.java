package com.mipagina.payment_type_service.service;

import com.mipagina.payment_type_service.model.PaymentType;

import java.util.List;

public interface IPaymentTypeService {
    public List<PaymentType> getAllPaymentType();
    public PaymentType getPaymentType(Long paymentId);
    public void savePaymentType(PaymentType paymentType);
    public void editPaymentType(Long paymentId,PaymentType paymentType);
    public void deletePaymentType(Long paymentId);
}
