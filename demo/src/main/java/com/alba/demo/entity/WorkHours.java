package com.alba.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.time.LocalTime;

@Embeddable
@Getter
@NoArgsConstructor
public class WorkHours {
    private boolean   negotiation;
    private LocalTime startTime;
    private LocalTime endTime;

    public WorkHours(boolean negotiation, LocalTime startTime, LocalTime endTime) {
        this.negotiation = negotiation;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
