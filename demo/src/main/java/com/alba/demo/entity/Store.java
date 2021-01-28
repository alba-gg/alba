package com.alba.demo.entity;

import javax.persistence.Convert;
import javax.persistence.Embedded;
import javax.persistence.ManyToOne;

public class Store {
    private Long     Id;
    private String   name;
    @Embedded
    private Address  address;
    private String   phone;
    @ManyToOne
    private Category category;
    private User     president;

    @Convert(converter = SubwayJsonConverter.class)
    private SubwayStation nealByStation;


}
