package com.web.application.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Long id;
    private LocalDate orderDate;
    //w clinic musi sie zawierac jesden konkretny denstist
    public Clinic clinic;
    private List<Product> productsList = new ArrayList<>();
}
