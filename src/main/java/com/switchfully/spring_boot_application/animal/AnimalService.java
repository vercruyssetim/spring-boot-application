package com.switchfully.spring_boot_application.animal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class AnimalService {

    private Logger logger = LoggerFactory.getLogger(AnimalService.class);
    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<AnimalDTO> getAllAnimals() {
        System.out.println("Hello world");
        System.out.println("Adding the feature");
        return animalRepository.getAllAnimals();
    }
}
