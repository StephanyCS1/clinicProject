package com.clinic.backendclinic.domain.dto.Doctor;

import com.clinic.backendclinic.domain.entities.Address;
import com.clinic.backendclinic.domain.entities.Hospital;

public record ShowDataDoctor(
        Long id,
        String phoneNumber,
        Boolean active,
        String typeContract,
        Address address,
        String wokingDays,
        Hospital hospital
) {
}
