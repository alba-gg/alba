package com.alba.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.time.LocalTime;

@Embeddable
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkHours {
    private boolean   negotiation;
    private LocalTime startTime;
    private LocalTime endTime;
}
