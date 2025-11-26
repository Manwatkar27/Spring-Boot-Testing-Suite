package com.aman.Spring_Boot_Testing_Suite.repo;

import com.aman.Spring_Boot_Testing_Suite.entities.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    public void testExistsById(){
        Person person = new Person(null, "Test Name", "City");
        person = personRepo.save(person);
        boolean exists = personRepo.existsById(person.getPersonId());
        assertThat(exists).isTrue();
    }
}
