package com.alba.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class SubwayStation {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String line;

}
