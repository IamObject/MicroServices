package com.iod.PaymentService.service;

import com.iod.PaymentService.model.PaymentRequest;
import com.iod.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
