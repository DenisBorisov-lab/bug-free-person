package com.example.bugfreeperson.controller;

import com.example.bugfreeperson.model.Person;
import com.example.bugfreeperson.model.PersonDto;
import com.example.bugfreeperson.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class PersonController {

    private PersonServiceImpl service;

    @Autowired
    public PersonController(PersonServiceImpl service){
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<Object> savePerson(@RequestBody PersonDto personDto) {
        service.savePerson(personDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get/{id}")
    public String getPerson(@PathVariable UUID id, Model model){
        Person person = service.getPerson(id);
        model.addAttribute("serverTime", String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME)));
        model.addAttribute("person", person);
        return "user";
    }

    @GetMapping("/get_page")
    public String getHomePage(Model model){
        return "index";
    }

}
