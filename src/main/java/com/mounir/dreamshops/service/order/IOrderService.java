package com.mounir.dreamshops.service.order;

import com.mounir.dreamshops.dto.OrderDto;
import com.mounir.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
