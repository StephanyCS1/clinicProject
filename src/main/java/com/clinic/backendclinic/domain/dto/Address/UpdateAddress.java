package com.clinic.backendclinic.domain.dto.Address;

import jakarta.validation.constraints.NotBlank;

public record UpdateAddress(
        Long id,
        @NotBlank
        String street,
        @NotBlank
        String postalCode,
        @NotBlank
        String city,
        @NotBlank
        String departmet,
        @NotBlank
        String houseNumber,
        @NotBlank
        String additionalInfo
) {
}
