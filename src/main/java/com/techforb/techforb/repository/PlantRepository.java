package com.techforb.techforb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techforb.techforb.entity.Plant;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long>{

}
