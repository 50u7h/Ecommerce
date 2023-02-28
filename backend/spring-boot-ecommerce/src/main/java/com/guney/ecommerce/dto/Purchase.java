package com.guney.ecommerce.dto;

import com.guney.ecommerce.entity.Address;
import com.guney.ecommerce.entity.Customer;
import com.guney.ecommerce.entity.Order;
import com.guney.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;


}
