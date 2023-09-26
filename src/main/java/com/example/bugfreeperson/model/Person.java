package com.example.bugfreeperson.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "person")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "name", columnDefinition = "TEXT")
    private String name;
    @Column(name = "mail", columnDefinition = "TEXT")
    private String mail;
    @Column(name = "phone", columnDefinition = "TEXT")
    private String phoneNumber;
}
