package com.alba.demo.repository;

import com.alba.demo.entity.Store;
import com.alba.demo.repository_support.StoreRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {

}


