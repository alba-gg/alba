package com.alba.demo.controller;

import com.alba.demo.dto.UserCmdDto;
import com.alba.demo.service.UserCmdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserCmdService userCmdService;

    @PostMapping("")
    public Long userCreate(@Valid @RequestBody UserCmdDto userCmdDto){
        return userCmdService.create(userCmdDto);
    }
}
