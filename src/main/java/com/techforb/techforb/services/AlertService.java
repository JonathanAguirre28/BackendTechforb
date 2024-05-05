package com.techforb.techforb.services;

import java.util.List;

import com.techforb.techforb.dto.AlertDto;
import com.techforb.techforb.dto.CreateAlertDto;

public interface AlertService {

    List<AlertDto> getAll();
    void create(CreateAlertDto createAlertDto); 
    void delete(Long id);
}
