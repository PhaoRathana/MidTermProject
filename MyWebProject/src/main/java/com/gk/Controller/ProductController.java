package com.gk.Controller;

import com.gk.Service.ProductService;
import com.gk.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    private List<Product> cart = new ArrayList<>(); // In a real app, consider using a session or database for the cart

    @GetMapping
    public String getAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product/list";
    }

    @GetMapping("/{productId}")
    public String viewProductDetails(@PathVariable Long productId, Model model) {
        Product product = productService.getProductById(productId);
        model.addAttribute("product", product);
        return "product/details";
    }

    @PostMapping("/{productId}/addToCart")
    public String addToCart(@PathVariable Long productId, @RequestParam int quantity) {
        Product product = productService.addToCart(productId, quantity);
        cart.add(product);
        return "redirect:/products";
    }

    @GetMapping("/cart")
    public String viewCart(Model model) {
        model.addAttribute("cart", cart);
        return "product/cart";
    }

    @PostMapping("/placeOrder")
    public String placeOrder() {
        productService.placeOrder(cart);
        cart.clear();
        return "redirect:/products";
    }
}
