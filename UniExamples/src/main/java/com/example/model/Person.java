package com.example.model;

import com.example.dto.PersonDto;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String profession;

    public Person(String name, String profession){
        this.profession = profession;
        this.name = name;
    }

    public PersonDto toPersonDto(){
        PersonDto personDto = new PersonDto();
        personDto.setName(this.name);
        personDto.setProfession(this.profession);
        return personDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
