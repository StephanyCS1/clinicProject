package com.clinic.backendclinic.domain.dto.Doctor;

import com.clinic.backendclinic.domain.entities.Address;
import com.clinic.backendclinic.domain.entities.Appointment;
import com.clinic.backendclinic.domain.entities.Hospital;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public record UpdateDoctor(
        Long id,
        String phoneNumber,
        Boolean active,
        String typeContract,
        Address address,
        Integer contractDurationInMonths,
        LocalDate contractStartDate,
        String wokingDays,
        Hospital hospital,
        Appointment appointment
){
}
