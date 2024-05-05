package com.techforb.techforb.services.impl;

import java.util.List;

import java.util.Optional;
import org.springframework.stereotype.Service;

import com.techforb.techforb.dto.CreatePlantDto;
import com.techforb.techforb.dto.PlantDto;
import com.techforb.techforb.entity.Plant;
import com.techforb.techforb.services.PlantService;
import com.techforb.techforb.repository.PlantRepository;


@Service
public class PlantServiceImpl implements PlantService{

    private PlantRepository plantRepository;

    public PlantServiceImpl(PlantRepository plantRepository){
        this.plantRepository = plantRepository;
    }

    @Override
    public List<PlantDto> getAll() {
        return plantRepository.findAll().stream()
        .map(entity -> {
            return PlantDto.builder()
            .id(entity.getId())
            .icon(entity.getIcon())
            .country(entity.getCountry())
            .name(entity.getName())
            .readings(entity.getReadings())
            .mediumAlerts(entity.getMediumAlerts())
            .redAlerts(entity.getRedAlerts())
            .iconActions(entity.getIconActions())
            .build();
    })
    .toList();
    }

    @Override
    public void create(CreatePlantDto createPlantDto) {

        Plant plantEntity = new Plant();
        plantEntity.setIcon(createPlantDto.getIcon());
        plantEntity.setCountry(createPlantDto.getCountry());
        plantEntity.setName(createPlantDto.getName());
        plantEntity.setReadings(createPlantDto.getReadings());
        plantEntity.setMediumAlerts(createPlantDto.getMediumAlerts());
        plantEntity.setRedAlerts(createPlantDto.getRedAlerts());
        plantEntity.setIconActions(createPlantDto.getIconActions());

        plantRepository.save(plantEntity);
    }

    @Override
    public void delete(Long id) {
        plantRepository.deleteById(id);
    }

    @Override
    public void update(Long id, CreatePlantDto updatedPlantDto) {
        Optional<Plant> optionalPlant = plantRepository.findById(id);
        if (optionalPlant.isPresent()) {
            Plant plant = optionalPlant.get();
            plant.setIcon(updatedPlantDto.getIcon());
            plant.setCountry(updatedPlantDto.getCountry());
            plant.setName(updatedPlantDto.getName());
            plant.setReadings(updatedPlantDto.getReadings());
            plant.setMediumAlerts(updatedPlantDto.getMediumAlerts());
            plant.setRedAlerts(updatedPlantDto.getRedAlerts());
            plant.setIconActions(updatedPlantDto.getIconActions());
            plantRepository.save(plant);
        } 
    }
}
