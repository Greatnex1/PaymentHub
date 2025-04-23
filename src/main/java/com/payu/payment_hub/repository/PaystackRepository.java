package com.payu.payment_hub.repository;

import com.payu.payment_hub.model.entity.PaystackTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaystackRepository extends JpaRepository<PaystackTransaction, Long> {
    PaystackTransaction findByReference(String ref);

}
