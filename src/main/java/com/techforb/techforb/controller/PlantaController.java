package com.techforb.techforb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techforb.techforb.services.PlantService;
import com.techforb.techforb.dto.PlantDto;
import com.techforb.techforb.dto.CreatePlantDto;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("plants")
@CrossOrigin(origins = "http://localhost:4200")
public class PlantaController {
    private PlantService plantService;

    public PlantaController (PlantService PlantService){
        this.plantService = PlantService;
    }

    @ResponseBody
    @GetMapping
    public List<PlantDto> getAPlants() {
        return plantService.getAll();
    }

    @PostMapping
    public void create(@Valid @RequestBody CreatePlantDto createPlantDto) {

        plantService.create(createPlantDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlant(@PathVariable Long id) {
        plantService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePlant(@PathVariable Long id, @Valid @RequestBody CreatePlantDto updatedPlantDto) {
    plantService.update(id, updatedPlantDto);
    return ResponseEntity.noContent().build();
}
}
