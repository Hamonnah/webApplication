package com.web.application.repository;

import com.web.application.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Repository
@Transactional
public interface ProductDAO extends CrudRepository<Product, Integer> {

    @Override
    List<Product> findAll();

    //@Override
    Optional<Product> findById(int productId);

    @Override
    Product save(Product product);

}
