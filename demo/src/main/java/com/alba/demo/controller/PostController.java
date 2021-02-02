package com.alba.demo.controller;

import com.alba.demo.dto.PostCmdDto;
import com.alba.demo.entity.JobPost;
import com.alba.demo.service.JobPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final JobPostService jobPostService;

    @PostMapping("")
    public Long createPost(@Valid @RequestBody PostCmdDto postCmdDto) {
        return jobPostService.create(postCmdDto);
    }

    @GetMapping("{id}")
    public JobPost getPost(@PathVariable Long id) {
        return jobPostService.read(id);
    }
}
