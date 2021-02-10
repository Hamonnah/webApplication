package com.web.application.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PRODUCTS")
public class Product {

    public Product(String productName) {
        this.productName = productName;
    }

    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID", unique = true)
    private int id;

    @Column(name = "PRODUCT_NAME")
    private String productName;

}
