package com.alba.demo.entity;

import javax.persistence.Embeddable;
import java.time.LocalTime;

@Embeddable
public class WorkHours {
    private boolean   negotiation;
    private LocalTime startTime;
    private LocalTime endTime;
}
