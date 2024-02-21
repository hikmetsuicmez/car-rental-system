package com.hikmetsuicmez.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String brand;
    private String model;
    private String color;
    @NotBlank
    private String carBodyStyle;
    private String transmissionType;
    private String fuelType;
    private int hp;
    private int year;
    private double dailyPrice;
    private boolean available;
    // location field
    // alım tarihi teslim tarihi



    // isteğe bağlı kasko-sigorta ekstra ödemeli seçenek ??

}
