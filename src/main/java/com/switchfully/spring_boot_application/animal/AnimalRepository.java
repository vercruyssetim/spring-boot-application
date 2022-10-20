package com.switchfully.spring_boot_application.animal;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnimalRepository {
    public List<AnimalDTO> getAllAnimals() {
        return List.of(new AnimalDTO("name"));
    }
}
