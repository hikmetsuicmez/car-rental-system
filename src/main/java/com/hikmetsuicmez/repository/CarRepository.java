package com.hikmetsuicmez.repository;

import com.hikmetsuicmez.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {

    List<Car> findAllByCarBodyStyle(String carBodyStyle);
    List<Car> findByAvailableIsTrue();
}
