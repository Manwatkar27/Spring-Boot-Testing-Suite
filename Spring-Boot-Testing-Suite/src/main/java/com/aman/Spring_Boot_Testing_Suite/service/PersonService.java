package com.aman.Spring_Boot_Testing_Suite.service;

import com.aman.Spring_Boot_Testing_Suite.entities.Person;
import com.aman.Spring_Boot_Testing_Suite.repo.PersonRepo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonRepo repo;
    public PersonService(PersonRepo repo){
        this.repo = repo;
    }
    public List<Person> getAllPerson(){
        return repo.findAll();
    }
}
