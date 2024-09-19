package com.springLearn.springDev.services;

import com.springLearn.springDev.web.model.SpringBasicDTO;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public SpringBasicDTO getCarByID(UUID cID) {
        return SpringBasicDTO.builder()
                .id(UUID.randomUUID())
                .carName("BMW E40")
                .carStyle("SUV")
                .build();
    }
}
