package com.alba.demo.service;

import com.alba.demo.repository.JobPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class JobPostService {

    private final JobPostRepository jobPostRepository;
}
