package com.switchfully.spring_boot_application.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {

    private final Logger logger = LoggerFactory.getLogger(PersonController.class);

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<PersonDTO> getAllPersons() {
        logger.debug("Getting all persons");
        return personService.getAllPersons();
    }

    @GetMapping(path = "{id}")
    public PersonDTO getPerson(@PathVariable int id) {
        return personService.getPerson(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void getPerson(@RequestBody PersonDTO personDTO) {
        personService.save(personDTO);
    }

    @PutMapping(consumes = "application/json", path = "{id}")
    public PersonDTO getPerson(@RequestBody PersonDTO personDTO, @PathVariable int id) {
        return personService.getPerson(id);
    }

    @DeleteMapping(path = "{id}")
    public void deletePerson(@PathVariable int id) {
        personService.deletePerson(id);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public void handleIllegalArgument(IllegalArgumentException illegalArgumentException, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendError(HttpStatus.BAD_REQUEST.value(), illegalArgumentException.getMessage());
    }

}
