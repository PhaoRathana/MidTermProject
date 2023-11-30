package com.gk.Controller;

import com.gk.Service.ShoppingCartService;
import com.gk.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    ShoppingCartService shoppingCartService;
    public ShoppingCartController(ShoppingCartService shoppingCartService){
        this.shoppingCartService = shoppingCartService;
    }

    @PostMapping("/add")
    public void addToCart(@RequestParam Long productId) {
        shoppingCartService.addToCart(productId);
    }

    @GetMapping
    public ShoppingCart viewCart() {
        return shoppingCartService.getShoppingCart();
    }

    @PostMapping("/checkout")
    public void checkout() {
        shoppingCartService.checkout();
    }
}
