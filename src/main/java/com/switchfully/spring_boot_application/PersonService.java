package com.switchfully.spring_boot_application;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private PersonMapper personMapper;

    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }
    public PersonDTO getBeanPerson() {
        return personMapper.mapToDTO(personRepository.getPerson());
    }

}
