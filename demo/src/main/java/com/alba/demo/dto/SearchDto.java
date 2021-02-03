package com.alba.demo.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SearchDto {
    private String  subway;
    private String  category;
    private int     hourlyWage;
    private String  startTime;
    private String  endTime;
    //todo 요일은 나중에 추가

}
