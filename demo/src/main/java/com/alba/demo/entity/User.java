package com.alba.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {
    @Id @GeneratedValue

    private Long id;
    @Column(length = 30)
    private String userId;
    @Column(length = 30)
    private String password;
    @Column(length = 20)
    private String email;
    @Column(length = 20)
    private String name;
    private int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Embedded
    private Address address;
}
