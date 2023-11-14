package com.clinic.backendclinic.domain.dto.Patient;

import com.clinic.backendclinic.domain.entities.Address;
import com.clinic.backendclinic.domain.entities.Appointment;
import com.clinic.backendclinic.domain.entities.Authorization;
import com.clinic.backendclinic.domain.entities.Hospital;

import java.util.List;

public record ShowDataPatient(
        Long id,
        String phoneNumber,
        Address address,
        Hospital hospital,
        List<Authorization> authorization,
        List<Appointment> appointments
) {
}
