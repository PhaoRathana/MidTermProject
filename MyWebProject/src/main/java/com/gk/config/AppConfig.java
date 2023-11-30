package com.gk.config;

import com.gk.Repository.ProductRepository;
import com.gk.model.Product;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Configuration
public class AppConfig {

    @Bean
    @Primary
    public ProductRepository productRepository() {
        // Create and configure the ProductRepository instance
        return new ProductRepository() {
            @Override
            public List<Product> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Product> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Product> S save(S entity) {
                return null;
            }

            @Override
            public <S extends Product> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<Product> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public List<Product> findAll() {
                return null;
            }

            @Override
            public List<Product> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }


            @Override
            public void delete(Product entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }


            @Override
            public void deleteAll(Iterable<? extends Product> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Product> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Product> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Product> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Product getOne(Long aLong) {
                return null;
            }

            @Override
            public Product getById(Long aLong) {
                return null;
            }

            @Override
            public Product getReferenceById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Product> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Product> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Product> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Product> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Product, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }

            @Override
            public List<Product> findByCategory(String category) {
                return null;
            }

            @Override
            public List<Product> findByBrand(String brand) {
                return null;
            }

            @Override
            public List<Product> findByColor(String color) {
                return null;
            }

            @Override
            public List<Product> findByPriceLessThan(double price) {
                return null;
            }

            @Override
            public List<Product> findByNameContaining(String keyword) {
                return null;
            }

            @Override
            public List<Product> findExpensiveProductsInCategory(String category, double maxPrice) {
                return null;
            }

            @Override
            public List<Product> findProductsByBrandNative(String brand) {
                return null;
            }
        };
    }

    @Bean
    public DataSource dataSource() {
        // Configure and return the data source bean
        return new DriverManagerDataSource();
    }

    @Bean
    public EntityManagerFactory entityManagerFactory() {
        // Configure and return the entity manager factory bean
        return Persistence.createEntityManagerFactory("myPersistenceUnit");
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        // Configure and return the transaction manager bean
         return new JpaTransactionManager(entityManagerFactory);
    }

}