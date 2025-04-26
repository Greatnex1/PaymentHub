package com.payu.payment_hub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;

@Builder
public record CreatePlanRequest(
        @NotEmpty(message = "Plan name field is required")
        @JsonProperty("name")
        String name,

        @NotEmpty(message = "This field is required")
        @JsonProperty("interval")
        String interval,

        @NotEmpty(message = "Amount cannot be null")
        @JsonProperty("amount")
        @Min(value = 100, message = "amount should be more than 100 NGN")
        @Pattern(regexp = "^[0-9]+$", message = "Can only be digits")
        String amount,

        @JsonProperty("currency")
        String currency
) {
}
