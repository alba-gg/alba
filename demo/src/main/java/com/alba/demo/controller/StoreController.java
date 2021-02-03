package com.alba.demo.controller;

import com.alba.demo.entity.Store;
import com.alba.demo.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    @GetMapping("/list")
    public List<Store> getStoreList(@RequestParam(name = "category_id") String categoryId) {
        return storeService.storeList(categoryId);
    }
}
