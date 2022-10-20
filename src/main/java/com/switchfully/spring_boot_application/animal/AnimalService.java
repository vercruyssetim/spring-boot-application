package com.switchfully.spring_boot_application.animal;

import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class AnimalService {
    public List<AnimalDTO> getAllAnimals() {
        System.out.println("hello world");
        return List.of(new AnimalDTO("name"));
    }
}
