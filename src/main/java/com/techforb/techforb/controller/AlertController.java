package com.techforb.techforb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techforb.techforb.dto.AlertDto;
import com.techforb.techforb.services.AlertService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


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
    
}
