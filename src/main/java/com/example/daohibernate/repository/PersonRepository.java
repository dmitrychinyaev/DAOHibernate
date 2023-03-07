package com.example.daohibernate.repository;

import com.example.daohibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Repository
@RequiredArgsConstructor
public class PersonRepository {
    @PersistenceContext
    private final EntityManager entityManager;
    public List<Person> getPersonsByCity(String city) {
        var query = entityManager.createNativeQuery("select * from Person where city_of_living = " + city, Person.class);
        return query.getResultList();
    }
}
