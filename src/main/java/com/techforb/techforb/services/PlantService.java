package com.techforb.techforb.services;

import java.util.List;

import com.techforb.techforb.dto.PlantDto;
import com.techforb.techforb.dto.CreatePlantDto;

public interface PlantService {

    List<PlantDto> getAll();
    void create(CreatePlantDto createPlantDto);
    void delete(Long id);
    void update(Long id, CreatePlantDto updatedPlantDto);
}

