package com.techforb.techforb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techforb.techforb.dto.AlertDto;
import com.techforb.techforb.dto.CreateAlertDto;
import com.techforb.techforb.services.AlertService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("alert")
public class AlertController {

    private AlertService alertService;

    public AlertController (AlertService alertService){
        this.alertService = alertService;
    }

    @GetMapping
    public List<AlertDto> getAlert() {
        return alertService.getAll();
    }

    @PostMapping
    public void create(@Valid @RequestBody CreateAlertDto createAlertDto) {
        
        alertService.create(createAlertDto);
    }
    
    
}
