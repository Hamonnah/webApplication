package com.web.application.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {

    private String name;
    private Long id;
    private UserType userType;
}
