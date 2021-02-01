package com.alba.demo.controller;

import com.alba.demo.dto.PostCmdDto;
import com.alba.demo.service.JobPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final JobPostService jobPostService;

    @PostMapping("")
    public Long postCreate(@Valid @RequestBody PostCmdDto postCmdDto) {
        return 1L;
    }
}
