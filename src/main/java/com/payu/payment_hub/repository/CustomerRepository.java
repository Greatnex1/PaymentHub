package com.payu.payment_hub.repository;

import com.payu.payment_hub.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{}
