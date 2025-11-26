package com.aman.Spring_Boot_Testing_Suite.repo;

import com.aman.Spring_Boot_Testing_Suite.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepo extends JpaRepository<Person, Integer> {

    boolean existsById(Integer id);
}
