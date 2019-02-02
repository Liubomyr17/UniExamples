package com.example.controller;

import com.example.dto.PersonDto;
import com.example.model.Person;
import com.example.service.HelloService;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private PersonService personService;

    @GetMapping
    @RequestMapping("/{name}")
    public String getHelloMsg(@PathVariable String name) {
        return helloService.getMessageFrom(name);
    }

    @PostMapping
    @RequestMapping("person/save")
    public Long savePerson(@RequestBody PersonDto personDto){
        helloService.updatePersonProfession(personDto);
        return personService.save(personDto);
    }

}
