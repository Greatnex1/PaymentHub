package com.payu.payment_hub.dto;

import lombok.*;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendPaymentRequest {
    private String source;
    private BigInteger amount;
    private String recipient;
    private String reason;
    private String currency;
    private String reference;
}
