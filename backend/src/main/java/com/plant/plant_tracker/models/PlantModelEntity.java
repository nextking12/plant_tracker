package com.plant.plant_tracker.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
public class PlantModelEntity {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    @Size(min=3, max=50, message="Name must be between 3 and 50 characters")
    private String species;



}
