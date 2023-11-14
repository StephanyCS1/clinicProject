package com.clinic.backendclinic.domain.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "diagnosis_assessment")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DiagnosisAndAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String diagnostics;
    private String description;
    private String assessment;
    @OneToOne
    private Treatment treatment;
    private String notes;
}
