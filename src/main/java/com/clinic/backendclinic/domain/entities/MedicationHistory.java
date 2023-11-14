package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "medication_history")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicationHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Medication> medicationList;
}
