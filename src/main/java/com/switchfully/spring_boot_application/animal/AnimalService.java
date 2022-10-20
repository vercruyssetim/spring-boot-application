package com.switchfully.spring_boot_application.animal;

import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class AnimalService {
    public List<AnimalDTO> getAllAnimals() {
        //TODO: remove this fake
        return List.of(new AnimalDTO("name"));
    }
}
