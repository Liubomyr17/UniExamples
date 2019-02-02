package com.example.service;

import com.example.dto.PersonDto;

public interface HelloService {
    String getMessageFrom(String name);
    void updatePersonProfession(PersonDto personDto);
}
