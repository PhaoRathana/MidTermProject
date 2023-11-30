package com.gk.Repository;

import com.gk.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    @Service
    public class ShoppingCartService {

        private final ShoppingCartRepository shoppingCartRepository;

        @Autowired
        public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
            this.shoppingCartRepository = shoppingCartRepository;
        }
    }
}
