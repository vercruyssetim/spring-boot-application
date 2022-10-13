package com.switchfully.spring_boot_application;

import org.assertj.core.util.Lists;

import java.util.List;

public class RealPersonRepository implements PersonRepository {

    private List<Person> personList = Lists.newArrayList(new Person("first", "last"));

    public Person getPerson() {
        return personList.get(0);//that connects to the database
    }
}
