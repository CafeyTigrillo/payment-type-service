package com.mipagina.payment_type_service.repository;

import com.mipagina.payment_type_service.model.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentTypeRepository extends JpaRepository<PaymentType,Long> {
}
