package com.techforb.techforb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techforb.techforb.entity.Sensors;

@Repository
public interface SensorsRepository extends JpaRepository<Sensors, Long>{

}
