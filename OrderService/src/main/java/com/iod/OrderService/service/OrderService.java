package com.iod.OrderService.service;

import com.iod.OrderService.model.OrderRequest;
import com.iod.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
