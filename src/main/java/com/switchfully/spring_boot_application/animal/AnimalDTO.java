package com.switchfully.spring_boot_application.animal;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Objects;

public class AnimalDTO {

    private String name;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public AnimalDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalDTO animalDTO = (AnimalDTO) o;
        return Objects.equals(name, animalDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
