package com.alba.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostCmdDto {
    private String title;
    private String contents;
    private Long storeId;
    private int hourlyWage;
    private boolean negotiation;
    private String startTime;
    private String endTime;
}
