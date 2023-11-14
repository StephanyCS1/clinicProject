package com.clinic.backendclinic.domain.dto.Adm;

import com.clinic.backendclinic.domain.entities.Address;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public record NewAdm(
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
        @NotBlank
        String typeContract,
        @NotNull
        Address address,
        @NotNull
                @Min(2)
        Integer contractDurationInMonths,
        @NotNull
        LocalDate contractStartDate,
        @NotBlank
        String proffession,
        @NotNull
        Integer yearsOfExperience,
        @NotNull
        byte curriculumVitae
){
        }
