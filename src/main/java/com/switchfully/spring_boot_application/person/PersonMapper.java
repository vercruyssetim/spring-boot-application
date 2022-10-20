package com.switchfully.spring_boot_application.person;

import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class PersonMapper {
    public PersonDTO mapToDTO(Person person) {
        return new PersonDTO(person.getId(), person.getFirstName(), person.getLastName());
    }

    public List<PersonDTO> mapToDTO(List<Person> allPerson) {
        return allPerson.stream().map(t -> mapToDTO(t)).collect(toList());
    }

    public Person mapToPerson(PersonDTO personDTO) {
        return new Person(personDTO.getId(), personDTO.getFirstName(), personDTO.getLastName());
    }
}
