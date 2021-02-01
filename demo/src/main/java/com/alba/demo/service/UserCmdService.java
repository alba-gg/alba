package com.alba.demo.service;

import com.alba.demo.dto.UserCmdDto;
import com.alba.demo.entity.Address;
import com.alba.demo.entity.Gender;
import com.alba.demo.entity.User;
import com.alba.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserCmdService {

    private final UserRepository userRepository;

    public Long create(UserCmdDto dto) {

        User user = User.builder()
                .userId(dto.getUserId())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .name(dto.getName())
                .age(dto.getAge())
                .gender(genderCheck(dto.getGender()))
                .address(Address.builder()
                        .city(dto.getCity())
                        .street(dto.getStreet())
                        .zipCode(dto.getZipCode())
                        .build())
                .build();

        User createdUser = userRepository.save(user);
        return createdUser.getId();

    }

    private Gender genderCheck(String gender) {
        if (gender.equals(Gender.MAN.toString())) {
            return Gender.MAN;
        }
        return Gender.WOMAN;

    }

}
