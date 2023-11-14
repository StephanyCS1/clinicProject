package com.clinic.backendclinic.domain.dto.MedReceptionist;

import com.clinic.backendclinic.domain.entities.Address;
import com.clinic.backendclinic.domain.entities.Appointment;
import com.clinic.backendclinic.domain.entities.Authorization;
import com.clinic.backendclinic.domain.entities.Hospital;

import java.util.List;

public record ShowDataMedReceptionist(
        Long id,
        String phoneNumber,
        Address address,
        String rol,
        Hospital hospital
) {
}
