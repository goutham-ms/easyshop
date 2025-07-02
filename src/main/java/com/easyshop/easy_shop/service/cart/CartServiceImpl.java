package com.easyshop.easy_shop.service.cart;

import com.easyshop.easy_shop.exceptions.ResourceNotFoundException;
import com.easyshop.easy_shop.model.Cart;
import com.easyshop.easy_shop.model.CartItem;
import com.easyshop.easy_shop.model.User;
import com.easyshop.easy_shop.repository.CartItemRepository;
import com.easyshop.easy_shop.repository.CartRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RequiredArgsConstructor
@Service
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;

    private final AtomicLong cartIdGenerator = new AtomicLong(0);

    @Override
    public Cart getCart(Long id) {
         Cart cart = cartRepository.findById(id)
                 .orElseThrow(() -> new ResourceNotFoundException("Cart not found!"));
         BigDecimal totalAmount = cart.getTotalAmount();
         cart.setTotalAmount(totalAmount);
         return cartRepository.save(cart);
    }

    @Transactional
    @Override
    public void clearCart(Long id) {
        Cart cart = getCart(id);
        cartItemRepository.deleteAllByCartId(id);
        cart.getItems().clear();
        cartRepository.deleteById(id);

    }

    @Override
    public BigDecimal getTotalPrice(Long id) {
        Cart cart = getCart(id);
        return cart.getTotalAmount();
    }

    @Override
    public Cart newCartInitializer(User user) {
       return Optional.ofNullable(getCartByUserId(user.getId()))
               .orElseGet(() -> {
                   Cart cart = new Cart();
                   cart.setUser(user);
                   return cartRepository.save(cart);
               });
    }

    @Override
    public Cart getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }
}
