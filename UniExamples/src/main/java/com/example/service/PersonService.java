package com.example.service;

import com.example.dto.PersonDto;
import com.example.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    Person getPersonById(Long id);
    Long save(PersonDto person);
}
