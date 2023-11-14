package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "treatments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "treatments", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Doctor doctor;
    @OneToOne(mappedBy = "treatments", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Patient patient;
    @OneToMany(mappedBy = "treatments", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Medication> medication;
    @OneToMany(mappedBy = "treatments", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Exams> exams;
    private String evolutionDiagnostic;
}
