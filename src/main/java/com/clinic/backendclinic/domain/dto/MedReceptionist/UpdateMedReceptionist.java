package com.clinic.backendclinic.domain.dto.MedReceptionist;

import com.clinic.backendclinic.domain.entities.*;
import lombok.Data;

import java.util.List;

@Data
public record UpdateMedReceptionist(
        Long id,
        String phoneNumber,
        Address address,
        Hospital hospital
){
}
