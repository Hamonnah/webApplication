package com.web.application.service;

import com.web.application.domain.Product;
import com.web.application.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDbService {

    @Autowired
    private ProductDAO productDao;

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    public Product getProduct(int productId) {
        return productDao.findById(productId).orElse(null);
    }

    public Product saveProduct (Product product) {
        return productDao.save(product);
    }

    public void deleteProduct(Long productId) {

    }

}
