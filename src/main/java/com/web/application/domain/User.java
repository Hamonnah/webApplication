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
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID", unique = true)
    private Long id;

    @Column(name = "USER_NAME")
    private String name;

    @Column(name = "USER_TYPE")
    private UserType userType;
}
