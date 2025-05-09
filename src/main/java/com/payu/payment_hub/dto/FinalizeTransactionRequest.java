package com.payu.payment_hub.dto;

public record FinalizeTransactionRequest(
        String transfer_code,
        String otp
) {
}
