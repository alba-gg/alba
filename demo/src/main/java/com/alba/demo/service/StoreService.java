package com.alba.demo.service;

import com.alba.demo.entity.Store;
import com.alba.demo.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;

    public List<Store> storeList(Long categoryId) {

//        return storeRepository.findByCategory(Long.parseLong(categoryId));
        return storeRepository.findByCategory(categoryId);
    }


}
