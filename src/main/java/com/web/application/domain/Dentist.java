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
@Table(name = "DENTISTS")
public class Dentist {

    @Id
    @GeneratedValue
    @Column(name = "DENTIST_ID", unique = true)
    private int id;

    @Column(name = "DENTIST_NAME")
    private String name;

}
