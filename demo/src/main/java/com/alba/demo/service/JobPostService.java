package com.alba.demo.service;

import com.alba.demo.dto.PostCmdDto;
import com.alba.demo.entity.JobPost;
import com.alba.demo.entity.WorkHours;
import com.alba.demo.repository.JobPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
@Transactional
@RequiredArgsConstructor
public class JobPostService {

    private final JobPostRepository jobPostRepository;

    public Long create(PostCmdDto postCmdDto) {
        JobPost jobPost = JobPost.builder()
                .title(postCmdDto.getTitle())
                .content(postCmdDto.getContents())
                .hourlyWage(postCmdDto.getHourlyWage())
                .workHours(WorkHours.builder()
                        .negotiation(postCmdDto.isNegotiation())
                        .startTime(stringToLocalTime(postCmdDto.getStartTime()))
                        .endTime(stringToLocalTime(postCmdDto.getEndTime()))
                        .build())
                .build();

        JobPost createdJobPost = jobPostRepository.save(jobPost);

        return createdJobPost.getId();
    }

    public JobPost read(Long id) {
        return jobPostRepository.getOne(id);
    }

    private LocalTime stringToLocalTime(String time) {
        return LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
    }
}
