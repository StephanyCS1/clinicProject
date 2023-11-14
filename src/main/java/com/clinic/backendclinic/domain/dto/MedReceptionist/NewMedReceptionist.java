package com.clinic.backendclinic.domain.dto.MedReceptionist;

import com.clinic.backendclinic.domain.entities.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public record NewMedReceptionist(
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
