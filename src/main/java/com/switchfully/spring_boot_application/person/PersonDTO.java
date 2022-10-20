package com.switchfully.spring_boot_application.person;

public class PersonDTO {
    private int id;
    private String firstName;
    private String lastName;

    public PersonDTO(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

}
