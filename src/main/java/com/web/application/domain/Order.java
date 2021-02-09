package com.web.application.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ORDERS")
public class Order {

    public Order(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID", unique = true)
    private Long id;

    @Column(name = "DATE_IN")
    private LocalDate dateIn;

    @Column(name = "DATE_OUT")
    private LocalDate dateOut;

    @Column(name = "PRODUCTS")
    @Transient
    private List<Product> productsList = new ArrayList<>();

    @Column(name = "WORK_STATUS")
    private WorkStatus status;

    @Column(name = "WORK_TYPE")
    @Enumerated(EnumType.ORDINAL)
    private WorkType workType;

    @Column(name = "DENTIST")
    @Transient
    @Enumerated(EnumType.ORDINAL)
    private User dentist;

    @Column(name = "TECHNICIAN")
    @Transient
    @Enumerated(EnumType.ORDINAL)
    private User technician;

}
