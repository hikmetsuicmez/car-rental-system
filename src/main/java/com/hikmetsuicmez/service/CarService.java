package com.hikmetsuicmez.service;

import com.hikmetsuicmez.entity.Car;
import com.hikmetsuicmez.exception.ResourceNotFoundException;
import com.hikmetsuicmez.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        List<Car> cars = carRepository.findAll();
        return cars;
    }

    public Car getCarById(Long id) {
        Car car = carRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("The ID of this car cannot be found!"));

        return car;
    }

    public List<Car> isAvailable() {
        List<Car> availableCars = carRepository.findByAvailableIsTrue();
        return availableCars;
    }

    public List<Car> getAllCarByCarBodyStyle(String carBodyStyle) {
        List<Car> cars = carRepository.findAllByCarBodyStyle(carBodyStyle);
        return cars;
    }

    public Car createCar(Car car) {
        Car newCar =  carRepository.save(car);
        return newCar;
    }

}

