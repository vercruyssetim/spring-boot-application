package com.switchfully.spring_boot_application;

public class PersonDTO {

    private String firstName;
    private String lastName;

    public PersonDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
