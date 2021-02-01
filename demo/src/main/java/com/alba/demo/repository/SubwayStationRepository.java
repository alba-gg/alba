package com.alba.demo.repository;

import com.alba.demo.entity.SubwayStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubwayStationRepository extends JpaRepository<SubwayStation, Long> {
}
