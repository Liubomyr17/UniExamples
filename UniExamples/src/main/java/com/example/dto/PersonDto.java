package com.example.dto;

import lombok.Data;

@Data
public class PersonDto {
    private String name;
    private String profession;

    public void setProfession(String profession) {
    }

    public void setName(String name) {
    }

    public String getName() {
        String name = getName();
        return name;
    }

    public String getProfession() {
        String profession = getProfession();
        return profession;
    }
}
