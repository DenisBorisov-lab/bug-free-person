package com.example.bugfreeperson.repository;

import com.example.bugfreeperson.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
    Person findPersonById(UUID id);
}
