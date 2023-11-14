package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "clinical_history")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClinicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate appointmentDate;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Patient patient;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Doctor doctor;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private ReasonForConsultation reasonForConsultation;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private FamilyMedicalHistory familyMedicalHistory;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private HabitsHistory habitsHistory;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private MedicationHistory medicationHistory;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private AllergyHistory allergyHistory;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private PhysicalExamination physicalExamination;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private LaboratoryResults laboratoryResults;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private DiagnosisAndAssessment diagnosisAndAssessment;
    @OneToOne(mappedBy = "clinical_history", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Treatment treatmentPlan;

}
