package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "laboratoriesResults")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LaboratoryResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<LaboratoryExams> labResults;
}
