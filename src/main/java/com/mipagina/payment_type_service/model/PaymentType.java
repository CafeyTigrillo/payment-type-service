package com.mipagina.payment_type_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Schema(description = "Entity representing a payment type")
public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the payment type", example = "1")
    private Long paymentId;

    @Schema(description = "Type of payment", example = "Credit Card", required = true)
    private String paymentType;

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public PaymentType() {
    }

    public PaymentType(Long paymentId, String paymentType) {
        this.paymentId = paymentId;
        this.paymentType = paymentType;
    }
}
