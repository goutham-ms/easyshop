package com.easyshop.easy_shop.service.cart;

import com.easyshop.easy_shop.dto.CartDto;
import com.easyshop.easy_shop.model.Cart;
import com.easyshop.easy_shop.model.User;

import java.math.BigDecimal;

public interface CartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart newCartInitializer(User user);

    Cart getCartByUserId(Long userId);

    CartDto convertToDto(Cart cart);
}
