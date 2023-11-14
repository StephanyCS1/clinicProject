package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public abstract class User {
    private String name;
    private String lastName;
    private String indentificationNumber;
    private String email;
    private String password;
    private String phoneNumber;
    private boolean active;
    @Enumerated(EnumType.STRING)
    private Rol rol;
    @Enumerated(EnumType.STRING)
    private TypeOfContract contract;
    @Embedded
    private Address address;
    private Integer contractDurationInMonths;
    private LocalDate contractStartDate;
}
