package com.example.bugfreeperson.service;

import com.example.bugfreeperson.model.Person;
import com.example.bugfreeperson.model.PersonDto;
import com.example.bugfreeperson.repository.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonService {

    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public void savePerson(PersonDto personDto) {
        Person person = Person.builder()
                .name(personDto.getName())
                .mail(personDto.getMail())
                .phoneNumber(personDto.getPhoneNumber())
                .build();
        repository.save(person);
    }
}
