package com.gk.Service;

import com.gk.Repository.ProductRepository;
import com.gk.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }


    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product addToCart(Long productId, int quantity) {return null;
    }

    public void placeOrder(List<Product> cart) {
    }
}