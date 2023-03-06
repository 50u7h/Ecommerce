package com.guney.ecommerce.service;

import com.guney.ecommerce.dto.PaymentInfo;
import com.guney.ecommerce.dto.Purchase;
import com.guney.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
