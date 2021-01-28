package com.alba.demo.entity;

import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class User {
    private Long Id;
    private String userId;
    private String password;
    private String email;
    private String name;
    private int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Embedded
    private Address address;
}
