package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "authorizations")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Authorization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Exams> exams;
    @OneToMany
    private List<Medication> medication;
    @OneToMany
    private List<Treatment> treatment;
    private LocalDate dateToGenerate;
    private boolean activated;
}
