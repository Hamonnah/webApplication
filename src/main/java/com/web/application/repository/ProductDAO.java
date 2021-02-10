package com.web.application.repository;

import com.web.application.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface ProductDAO extends CrudRepository<Product, Integer> {
}
