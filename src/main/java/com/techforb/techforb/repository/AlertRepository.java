package com.techforb.techforb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techforb.techforb.entity.Alert;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long>{
    
}
