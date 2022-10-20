package com.switchfully.spring_boot_application.person;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UserAlreadyExistsException extends ResponseStatusException {

    public UserAlreadyExistsException() {
        super(HttpStatus.BAD_REQUEST, "User already exists");
    }
}
