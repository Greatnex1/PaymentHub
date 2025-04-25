package com.payu.payment_hub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class HttpResponse<T> {
     int status;
     T body;
}