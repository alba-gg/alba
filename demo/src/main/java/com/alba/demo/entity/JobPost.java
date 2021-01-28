package com.alba.demo.entity;

import javax.persistence.Embedded;

public class JobPost {
    private Long Id;
    private String title;
    private String content;
    private int hourlyWage;

    @Embedded
    private WorkHours workHours;

}
