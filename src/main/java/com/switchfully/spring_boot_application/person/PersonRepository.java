package com.switchfully.spring_boot_application.person;

import org.assertj.core.util.Lists;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {

    private List<Person> personList = Lists.newArrayList(new Person(0, "first", "last"));

    public Person getPerson(int index) {
        return personList.get(index);//that connects to the database
    }

    public List<Person> getAllPerson() {
        return personList;
    }

    public void save(Person person) {
        person.setId(personList.size());
        personList.add(person);
    }

    public void update(int id, Person person) {
        person.setId(id);
        personList.set(id, person);
    }

    public void deletePerson(int id) {
        personList.remove(id);
    }

    public boolean alreadyExists(Person person) {
        return personList.contains(person);
    }
}
