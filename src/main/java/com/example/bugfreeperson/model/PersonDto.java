package com.example.bugfreeperson.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PersonDto {
    private String name;
    private String mail;
    @JsonProperty(value = "phone_number")
    private String phoneNumber;
}
