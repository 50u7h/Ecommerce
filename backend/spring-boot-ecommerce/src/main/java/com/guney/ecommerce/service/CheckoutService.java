package com.guney.ecommerce.service;

import com.guney.ecommerce.dto.Purchase;
import com.guney.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
