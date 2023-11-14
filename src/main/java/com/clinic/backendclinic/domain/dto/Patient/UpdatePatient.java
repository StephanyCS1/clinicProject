package com.clinic.backendclinic.domain.dto.Patient;

import com.clinic.backendclinic.domain.entities.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public record UpdatePatient(
        Long id,
        String phoneNumber,
        Address address,
        Hospital hospital,
        List<Appointment> appointmentList,
        List<MedicationAuth> medicationAuths,
        List<AllergyHistory> allergyHistories,
        List<Authorization> authorizationList,
        List<ClinicalHistory> clinicalHistories,
        List<Treatment> treatmentList
){
}
