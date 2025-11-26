package com.aman.Spring_Boot_Testing_Suite.services;

import com.aman.Spring_Boot_Testing_Suite.entities.Person;
import com.aman.Spring_Boot_Testing_Suite.service.PersonService;
import java.util.List;
import org.mockito.InjectMocks;


import com.aman.Spring_Boot_Testing_Suite.repo.PersonRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.verify;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Mock
    private PersonRepo personRepo;

    // Use @InjectMocks to inject Mocked beans into the service
    @InjectMocks
    private PersonService personService;

    @Test
    void getAllPerson() {
        // Arrange
        Person person1 = new Person(1, "Aman", "Nagpur");
        Person person2 = new Person(2, "Rahul", "Mumbai");
        Person person3 = new Person(3, "Shruti", "Pune");

        given(personRepo.findAll()).willReturn(List.of(person1, person2, person3));

        // Act
        List<Person> personList = personService.getAllPerson();

        // Assert
        assertThat(personList).isNotNull();
        assertThat(personList.size()).isEqualTo(2);
        verify(personRepo).findAll();
    }
}