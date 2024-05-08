package com.techforb.techforb.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techforb.techforb.dto.CreateSensorsDto;
import com.techforb.techforb.dto.SensorsDto;
import com.techforb.techforb.services.SensorsService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("sensors")
@CrossOrigin(origins = "*")
public class SensorsController {
    
    private SensorsService sensorsService;

    public SensorsController (SensorsService sensorsService){
        this.sensorsService = sensorsService;
    }
    @ResponseBody
    @GetMapping
    public List<SensorsDto> getSensors() {
        return sensorsService.getAll();
    }

    @PostMapping
    public void create(@Valid @RequestBody CreateSensorsDto createSensorsDto) {

        sensorsService.create(createSensorsDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSensors(@PathVariable Long id) {
        sensorsService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
