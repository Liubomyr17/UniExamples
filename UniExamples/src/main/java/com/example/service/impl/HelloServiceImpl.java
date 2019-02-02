package com.example.service.impl;


import com.example.dto.PersonDto;
import com.example.service.HelloService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {


    private PersonDto personDto;

    private List<String> professions = Arrays.asList("Программист", "Грузчик", "Шахтер", "Дурачок");

    @Override
    public String getMessageFrom(String name) {
        return "Привет меня зовут " + name + " я " + generateRandomProfession();
    }

    @Override
    public void updatePersonProfession(PersonDto personDto) {
        personDto.setProfession(generateRandomProfession());
    }

    private String generateRandomProfession() {
        return professions.get((int) (Math.random() * professions.size()));
    }

}
