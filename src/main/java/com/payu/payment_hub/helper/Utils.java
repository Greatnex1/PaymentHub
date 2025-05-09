package com.payu.payment_hub.helper;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payu.payment_hub.dto.PaymentVerificationResponse;
import com.payu.payment_hub.model.entity.Customer;
import com.payu.payment_hub.model.entity.PaystackTransaction;
import com.payu.payment_hub.model.enums.PaymentPlanType;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class Utils {
    public <T> T jsonToObject(String json, Class<T> c) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return objectMapper.readValue(json, c);
        } catch (Exception e) {
            return null;
        }
    }

    public PaystackTransaction mapPaysatckTransactionForSaving(PaymentVerificationResponse paymentVerificationResponse,
                                                               String customer, PaymentPlanType pricingPlanType) {
        return PaystackTransaction.builder()
                .customerId(customer)
                .reference(paymentVerificationResponse.getData().getReference())
                .amount(paymentVerificationResponse.getData().getAmount())
                .gatewayResponse(paymentVerificationResponse.getData().getGatewayResponse())
                .paidAt(paymentVerificationResponse.getData().getPaidAt())
                .createdAt(paymentVerificationResponse.getData().getCreatedAt())
                .channel(paymentVerificationResponse.getData().getChannel())
                .currency(paymentVerificationResponse.getData().getCurrency())
                .ipAddress(paymentVerificationResponse.getData().getIpAddress())
//                .pricingPlanType(pricingPlanType)
                .dateCreated(new Date())
                .build();
    }
    public String generatePaymentRef(){
        return "PP-".concat(LocalDateTime.now().toString());
    }
}

