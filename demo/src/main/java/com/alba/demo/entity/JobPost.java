package com.alba.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobPost {

    @Id @GeneratedValue
    private Long    Id;
    private String  title;

    @Column(columnDefinition="TEXT")
    private String  content;
    private int     hourlyWage;

    @Embedded
    private WorkHours workHours;

}
