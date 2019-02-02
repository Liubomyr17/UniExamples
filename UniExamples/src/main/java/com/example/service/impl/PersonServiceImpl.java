package com.example.service.impl;

import com.example.dto.PersonDto;
import com.example.model.Person;
import com.example.repository.PersonRepository;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepository.getPersonById(id);
    }

    @Override
    public Long save(PersonDto person) {
        return personRepository.save(
                new Person(
                        person.getName(),
                        person.getProfession()
                )).getId();
    }
}
