package com.switchfully.spring_boot_application.animal;

import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class AnimalService {

    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<AnimalDTO> getAllAnimals() {
        System.out.println("Hello world");
        return animalRepository.getAllAnimals();
    }
}
