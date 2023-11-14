package com.clinic.backendclinic.domain.dto.Adm;

import com.clinic.backendclinic.domain.entities.Address;
import com.clinic.backendclinic.domain.entities.Hospital;
import lombok.Data;

import java.time.LocalDate;

@Data
public record UpdateAdm(
        Long id,
        String phoneNumber,
        Boolean active,
        String typeContract,
        Address address,
        Integer contractDurationInMonths,
        LocalDate contractStartDate,
        Hospital hospital,
        byte curriculumVitae

){
}
