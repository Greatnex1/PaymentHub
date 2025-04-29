package com.payu.payment_hub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CreateTransferReceipient(
        @JsonProperty("type")
        String type,
        @JsonProperty("name")
        String name,
        @JsonProperty("accountNumber")
        String account_number,
        @JsonProperty("bankCode")
        String bank_code,
        String description,
        String currency,
        @JsonProperty(value = "authorizationCode")
        String authorization_code

) {
}
