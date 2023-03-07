package com.example.daohibernate.controller;

import com.example.daohibernate.entity.Person;
import com.example.daohibernate.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository repository;
    @GetMapping(path = "persons/by-city")
    public List<Person> personsByCity(@RequestParam String city){
        return repository.getPersonsByCity(city);
    }
}
