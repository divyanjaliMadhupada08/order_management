package com.amzur.order_management.service;
import com.amzur.order_management.dto.request.OrderRequest;
import com.amzur.order_management.dto.response.OrderResponse;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile("us")
@Service
public class OrderManagementUS implements OrderService{
    @Override
    public OrderResponse createOrder(OrderRequest orderRequest) {
        return null;
    }

    @Override
    public List<OrderResponse> getOrderById(Long orderId) {
        return null;
    }

    @Override
    public List<OrderResponse> getAllOrdersByUserId(Long userId) {
        return null;
    }
}
