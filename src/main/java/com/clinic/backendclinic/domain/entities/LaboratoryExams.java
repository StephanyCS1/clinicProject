package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "laboratoriesResults")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LaboratoryExams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String results;
    private String notes;
}
