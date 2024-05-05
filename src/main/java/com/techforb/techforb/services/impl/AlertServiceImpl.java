package com.techforb.techforb.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techforb.techforb.dto.AlertDto;
import com.techforb.techforb.dto.CreateAlertDto;
import com.techforb.techforb.entity.Alert;
import com.techforb.techforb.repository.AlertRepository;
import com.techforb.techforb.services.AlertService;

@Service
public class AlertServiceImpl implements AlertService {

    private AlertRepository alertRepository;

    public AlertServiceImpl(AlertRepository alertRepository){
        this.alertRepository = alertRepository;
    }

    @Override
    public List<AlertDto> getAll() {
        return alertRepository.findAll().stream()
        .map(entity -> {
            return AlertDto.builder()
            .id(entity.getId())
            .name(entity.getName())
            .quantity(entity.getQuantity())
            .status(entity.getStatus())
            .build();
        })
        .toList();
    }

    @Override
    public void create(CreateAlertDto createAlertDto) {

        Alert alertEntity = new Alert();
        alertEntity.setName(createAlertDto.getName());
        alertEntity.setQuantity(createAlertDto.getQuantity());
        alertEntity.setStatus(createAlertDto.getStatus());
        
        alertRepository.save(alertEntity);
    }

    @Override
    public void delete(Long id) {
        alertRepository.deleteById(id);
    }
}