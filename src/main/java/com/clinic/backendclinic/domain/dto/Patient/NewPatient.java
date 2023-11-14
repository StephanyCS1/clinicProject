package com.clinic.backendclinic.domain.dto.Patient;

import com.clinic.backendclinic.domain.entities.Address;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public record NewPatient(
        @NotBlank
        String name,
        @NotBlank
        String lastName,
        @NotBlank
        String identificationNumber,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Size(min = 8)
        String password,
        @NotBlank
        String phoneNumber,
        @NotBlank
        String rol,
        @NotNull
        Address address

){
        }
