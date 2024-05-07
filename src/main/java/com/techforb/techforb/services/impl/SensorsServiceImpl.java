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
            .reading(entity.getReading())
            .numberReading(entity.getNumberReading())
            .midLevel(entity.getMidLevel())
            .numberMid(entity.getNumberMid())
            .redAlert(entity.getRedAlert())
            .numberRedAlert(entity.getNumberRedAlert())
            .icon(entity.getIcon())
            .build();
        })
        .toList();
    }

    @Override
    public void create(CreateSensorsDto createSensorsDto) {

        Sensors sensorsEntity = new Sensors();
        sensorsEntity.setName(createSensorsDto.getName());
        sensorsEntity.setReading(createSensorsDto.getReading());
        sensorsEntity.setNumberReading(createSensorsDto.getNumberReading());
        sensorsEntity.setMidLevel(createSensorsDto.getMidLevel());
        sensorsEntity.setNumberMid(createSensorsDto.getNumberMid());
        sensorsEntity.setRedAlert(createSensorsDto.getRedAlert());
        sensorsEntity.setNumberRedAlert(createSensorsDto.getNumberRedAlert());
        sensorsEntity.setIcon(createSensorsDto.getIcon());

        sensorsRepository.save(sensorsEntity);
    }

    @Override
    public void delete(Long id) {
        sensorsRepository.deleteById(id);
}
}
