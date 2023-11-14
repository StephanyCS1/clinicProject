package com.clinic.backendclinic.domain.dto.Adm;

import com.clinic.backendclinic.domain.entities.Address;
import com.clinic.backendclinic.domain.entities.Hospital;

public record ShowDataAdm(
        Long id,
        String phoneNumber,
        Boolean active,
        String typeContract,
        Address address,
        String proffession,
        Hospital hospital
) {
}
