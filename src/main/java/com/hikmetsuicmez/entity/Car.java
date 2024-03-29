package com.hikmetsuicmez.entity;

import jakarta.persistence.*;
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
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "registration_nr", nullable = false, length = 8)
    private String registrationNr;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "is_available", nullable = false)
    private Boolean isAvailable;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "car_package_id", referencedColumnName = "id")
    private CarPackage carPackage;

    @OneToOne(orphanRemoval = true)
    private CarParameters carParameters;
    // location field
    // alım tarihi teslim tarihi



    // isteğe bağlı kasko-sigorta ekstra ödemeli seçenek ??

}
