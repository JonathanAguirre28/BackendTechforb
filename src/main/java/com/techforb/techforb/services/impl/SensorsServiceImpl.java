package com.techforb.techforb.services.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.techforb.techforb.dto.CreateSensorsDto;
import com.techforb.techforb.dto.SensorsDto;
import com.techforb.techforb.entity.Sensors;
import com.techforb.techforb.repository.SensorsRepository;
import com.techforb.techforb.services.SensorsService;

@Service
public class SensorsServiceImpl implements SensorsService{

    private SensorsRepository sensorsRepository;

    public SensorsServiceImpl(SensorsRepository sensorsRepository){
        this.sensorsRepository = sensorsRepository;
    }

    @Override
    public List<SensorsDto> getAll() {
        return sensorsRepository.findAll().stream()
        .map(entity -> {
            return SensorsDto.builder()
            .id(entity.getId())
            .name(entity.getName())
            .iconNumber(entity.getIconNumber())
            .number(entity.getNumber())
            .icon(entity.getIcon())
            .build();
        })
        .toList();
    }

    @Override
    public void create(CreateSensorsDto createSensorsDto) {

        Sensors sensorsEntity = new Sensors();
        sensorsEntity.setName(createSensorsDto.getName());
        sensorsEntity.setIconNumber(createSensorsDto.getIconNumber());
        sensorsEntity.setNumber(createSensorsDto.getNumber());
        sensorsEntity.setIcon(createSensorsDto.getIcon());

        sensorsRepository.save(sensorsEntity);
    }

    @Override
    public void delete(Long id) {
        sensorsRepository.deleteById(id);
}
}
