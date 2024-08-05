package com.example.hibernate.controller;

import com.example.hibernate.model.Person;
import com.example.hibernate.reposiroty.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(String city) {
        return personRepository.getPersonsByCity(city);
    }
}
