package com.alba.demo.repository_support;

import com.alba.demo.entity.Store;

import java.util.List;

public interface StoreRepositoryCustom {
    List<Store> findByCategory(Long categoryId);
}
