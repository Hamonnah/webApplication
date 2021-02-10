package com.web.application.dto;

import com.web.application.domain.*;
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

public class OrderDto {

    private int id;
    private LocalDate dateIn;
    private LocalDate dateOut;
    private List<Product> productsList = new ArrayList<>();
    private WorkStatus status;
    private WorkType workType;
    private User user;
    private Dentist dentist;

}
