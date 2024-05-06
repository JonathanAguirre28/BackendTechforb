package com.techforb.techforb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techforb.techforb.dto.AlertDto;
import com.techforb.techforb.dto.CreateAlertDto;
import com.techforb.techforb.services.AlertService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("alert")
@CrossOrigin(origins = "http://localhost:4200")
public class AlertController {

    private AlertService alertService;

    public AlertController (AlertService alertService){
        this.alertService = alertService;
    }

    @ResponseBody
    @GetMapping
    public List<AlertDto> getAlert() {
        return alertService.getAll();
    }

    @PostMapping
    public void create(@Valid @RequestBody CreateAlertDto createAlertDto) {
        
        alertService.create(createAlertDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlert(@PathVariable Long id) {
        alertService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
