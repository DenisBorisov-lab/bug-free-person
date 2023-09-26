package com.example.bugfreeperson.controller;

import com.example.bugfreeperson.model.PersonDto;
import com.example.bugfreeperson.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class PersonController {

    private PersonService service;

    @Autowired
    public PersonController(PersonService service){
        this.service = service;
    }

    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<Object> savePerson(@RequestBody PersonDto personDto) {
        service.savePerson(personDto);
        return ResponseEntity.ok().build();
    }

}
