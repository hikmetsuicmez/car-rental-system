package com.hikmetsuicmez.controller;

import com.hikmetsuicmez.entity.Car;
import com.hikmetsuicmez.service.CarService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars() {
        return ResponseEntity.ok(carService.getAllCars());
    }

    @GetMapping("/available")
    public ResponseEntity<List<Car>> isAvailable() {
        return ResponseEntity.ok(carService.isAvailable());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCar(@PathVariable Long id) {
        return ResponseEntity.ok(carService.getCarById(id));
    }

    @GetMapping("/{carBodyStyle}/carbodystyle")
    public ResponseEntity<List<Car>> getCarByCarBodyStyle(@PathVariable String carBodyStyle) {
        return ResponseEntity.ok(carService.getAllCarByCarBodyStyle(carBodyStyle));
    }

    @PostMapping
    public ResponseEntity<Car> addCar(@RequestBody @Valid Car car) {
        return new ResponseEntity<>(carService.createCar(car), HttpStatus.CREATED);
    }

}
