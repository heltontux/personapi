package one.digitallinnovation.personapi.controller;

import one.digitallinnovation.personapi.dto.MessageResponseDTO;
import one.digitallinnovation.personapi.entity.Person;
import one.digitallinnovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);

    }

}
