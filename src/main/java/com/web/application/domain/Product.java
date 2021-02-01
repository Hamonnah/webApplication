package com.web.application.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Product {

    //Zastanawiam sie czy moge w jakis
    // sposob korzystac z naszej w sensie firmowej bazy danych cy chocby strony interentowej?

    private Long id;
    private String productName;
    public Group group;
    private List<Order> orders = new ArrayList<>();

}
