package com.switchfully.spring_boot_application.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private PersonMapper personMapper;

    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public List<PersonDTO> getAllPersons() {
        return personMapper.mapToDTO(personRepository.getAllPerson());
    }

    public PersonDTO getPerson(int id) {
        return personMapper.mapToDTO(personRepository.getPerson(id));
    }

    public void save(PersonDTO personDTO) {
        Person newPerson = personMapper.mapToPerson(personDTO);
        if(personRepository.alreadyExists(newPerson)) {
            throw new IllegalArgumentException("User already exists");
        }
        personRepository.save(newPerson);
    }

    public void updatePerson(int id, PersonDTO personDTO) {
        personRepository.update(id, personMapper.mapToPerson(personDTO));
    }

    public void deletePerson(int id) {
        personRepository.deletePerson(id);
    }
}
