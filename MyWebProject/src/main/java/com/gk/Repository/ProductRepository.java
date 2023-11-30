package com.gk.Repository;

import com.gk.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Find all products by category
    List<Product> findByCategory(String category);

    // Find all products by brand
    List<Product> findByBrand(String brand);

    // Find all products by color
    List<Product> findByColor(String color);

    // Find all products by price less than the specified value
    List<Product> findByPriceLessThan(double price);

    // Find all products by name containing the specified keyword
    List<Product> findByNameContaining(String keyword);

    // Custom query using JPQL
    @Query("SELECT p FROM Product p WHERE p.category = :category AND p.price < :maxPrice")
    List<Product> findExpensiveProductsInCategory(@Param("category") String category, @Param("maxPrice") double maxPrice);

    // Custom query using native SQL
    @Query(value = "SELECT * FROM Product WHERE brand = :brand", nativeQuery = true)
    List<Product> findProductsByBrandNative(@Param("brand") String brand);
}