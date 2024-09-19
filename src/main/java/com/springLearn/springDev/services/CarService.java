package com.springLearn.springDev.services;

import com.springLearn.springDev.web.model.SpringBasicDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface CarService {
    SpringBasicDTO getCarByID(UUID cID);
}
