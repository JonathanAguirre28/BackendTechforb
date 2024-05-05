package com.techforb.techforb.services;

import java.util.List;

import com.techforb.techforb.dto.CreateSensorsDto;
import com.techforb.techforb.dto.SensorsDto;

public interface SensorsService {

    List<SensorsDto> getAll();
    void create(CreateSensorsDto createSensorsDto);
    void delete(Long id);

}
