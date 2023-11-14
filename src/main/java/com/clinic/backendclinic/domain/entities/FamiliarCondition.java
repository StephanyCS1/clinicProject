package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "familiar_condition")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FamiliarCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String medicalCondition;
    private String relationshipFamiliar;
}
