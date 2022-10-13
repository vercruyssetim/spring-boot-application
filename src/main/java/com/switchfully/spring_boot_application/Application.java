package com.switchfully.spring_boot_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public PersonRepository personRepository() {
        return () -> new Person("test", "test");
    }

    @Bean
    public Person person() {
        return new Person("Mr", "Bean");
    }
}
