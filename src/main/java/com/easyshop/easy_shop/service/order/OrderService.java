package com.easyshop.easy_shop.service.order;

import com.easyshop.easy_shop.dto.OrderDto;
import com.easyshop.easy_shop.model.Order;

import java.util.List;

public interface OrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}
