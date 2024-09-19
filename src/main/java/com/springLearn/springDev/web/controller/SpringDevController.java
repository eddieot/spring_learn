package com.springLearn.springDev.web.controller;

import com.springLearn.springDev.services.CarService;
import com.springLearn.springDev.web.model.SpringBasicDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RequestMapping("/api/v1/car")
@RestController
public class SpringDevController {

    private final CarService carService;

    public SpringDevController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{carID}")
    public ResponseEntity<SpringBasicDTO> getCar(@PathVariable("carID") UUID cID){
        return new ResponseEntity<>(carService.getCarByID(cID), HttpStatus.OK);
    }
}
