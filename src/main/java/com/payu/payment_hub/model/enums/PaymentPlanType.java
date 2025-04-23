package com.payu.payment_hub.model.enums;

import lombok.Getter;

@Getter
public enum PaymentPlanType {
    BASIC( "Basic"),
    STANDARD("Standard"),
    PREMIUM("Premium");
    private final String value;
    PaymentPlanType(String value) {
        this.value = value;
    }
}