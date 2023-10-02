package com.example.bugfreeperson.service;

import com.example.bugfreeperson.model.Person;
import com.example.bugfreeperson.model.PersonDto;

import java.util.UUID;

public interface PersonService {
    void savePerson(PersonDto dto);

    Person getPerson(UUID id);
}
