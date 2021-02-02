package com.web.application.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Long id;
    private LocalDate orderDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Product> productsList = new ArrayList<>();
    private WorkStatus status;
    private WorkType workType;
    private User dentist;
    private User technician;

}
