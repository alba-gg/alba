package com.alba.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserCmdDto {
    @NotNull(message = "user_id null")
    @NotEmpty(message = "user_id empty")
    private String userId;

    private String password;

    private String email;

    private String name;

    private int age;

    private String gender;

    private String city;

    private String street;

    private String zipCode;

}
