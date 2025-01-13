package com.majesty.shopbackend.service.order;

import java.util.List;

import com.majesty.shopbackend.dto.OrderDto;
import com.majesty.shopbackend.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}
