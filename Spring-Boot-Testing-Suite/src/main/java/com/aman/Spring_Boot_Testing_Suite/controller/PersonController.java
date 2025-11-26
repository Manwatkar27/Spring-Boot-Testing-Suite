package com.aman.Spring_Boot_Testing_Suite.controller;

import com.aman.Spring_Boot_Testing_Suite.entities.Person;
import com.aman.Spring_Boot_Testing_Suite.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PersonController {
    private final PersonService personService;
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getAllPersons(){
        return ResponseEntity.ok(personService.getAllPerson());
    }
}
