package com.alba.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long     id;
    private String   name;
    @Embedded
    private Address  address;
    private String   phone;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;
    @ManyToOne(fetch = FetchType.LAZY)
    private User     president;
    @ManyToOne(fetch = FetchType.LAZY)
    private SubwayStation subwayStation;

}
