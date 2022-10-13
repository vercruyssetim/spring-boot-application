package com.switchfully.spring_boot_application;

import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    public PersonDTO mapToDTO(Person person) {
        return new PersonDTO(person.getFirstName(), person.getLastName());
    }
}
