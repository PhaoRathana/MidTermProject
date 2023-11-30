package com.gk.Service;

import com.gk.Repository.ShoppingCartRepository;
import com.gk.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    public void addToCart(Long productId) {

    }

    public ShoppingCart getShoppingCart() {
        return null;
    }

    public void checkout() {
    }
}
