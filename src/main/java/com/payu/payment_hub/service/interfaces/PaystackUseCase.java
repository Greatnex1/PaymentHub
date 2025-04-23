package com.payu.payment_hub.service.interfaces;

import com.payu.payment_hub.dto.*;
import kong.unirest.HttpResponse;

public interface PaystackUseCase {
    CreatePlanResponse createPaystackPlan(CreatePlanRequest createPlanRequest);
    InitializePaymentResponse initializePaystackPayment(InitializePaymentRequest initializePaymentRequest);
    PaymentVerificationResponse paystackPaymentVerification(String ref, String plan, long id);

    HttpResponse<String> initiateTransfer(SendPaymentRequest sendPaymentRequest);

    HttpResponse<String> getListOfCountries();

    HttpResponse<String> getListOfStates(String Country);

    HttpResponse<String> getListOfBanks();

    HttpResponse<String> validateBankAccount(String accountNumber, String bankCode);

    HttpResponse<String> createReceipient(CreateTransferReceipient createTransferReceipient);

    HttpResponse<String> finalizeTransaction(FinalizeTransactionRequest finalizeTransactionRequest);
}
