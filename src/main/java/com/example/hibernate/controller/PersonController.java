package com.example.hibernate.controller;

import com.example.hibernate.model.Person;
import com.example.hibernate.reposiroty.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personRepository.findByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getPersonsByAge(@RequestParam Integer age) {
        return personRepository.findByIdAgeLessThanOrderByIdAgeAsc(age);
    }

    @GetMapping("/persons/by-name-surname")
    public Optional<Person> getPersonsByNameSurname(@RequestParam String name, @RequestParam String surname) {
        return personRepository.findByIdNameAndIdSurname(name, surname);
    }
}
