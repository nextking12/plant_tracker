package com.plant.plant_tracker.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Entity
public class PlantModelEntity {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(min=3, max=50, message="Name must be between 3 and 50 characters")
    private String species;

    @Setter
    @Getter
    private String notes;
    @Setter
    @Getter
    private String wateringFreq;
    @Setter
    @Getter
    private String location;

    public PlantModelEntity(int id, String species, String notes, String wateringFreq, String location) {
        this.id = id;
        this.species = species;
        this.notes = notes;
        this.wateringFreq = wateringFreq;
        this.location = location;
    }

    public PlantModelEntity() {}

    public @NotBlank @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String getSpecies() {
        return species;
    }

    public void setSpecies(@NotBlank @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlantModelEntity that = (PlantModelEntity) o;
        return id == that.id && Objects.equals(species, that.species) && Objects.equals(notes, that.notes) && Objects.equals(wateringFreq, that.wateringFreq) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, species, notes, wateringFreq, location);
    }
}
