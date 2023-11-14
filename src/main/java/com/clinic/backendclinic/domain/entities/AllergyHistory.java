package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "allergies")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AllergyHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String severity;
    private String reaction;
    private String triggers;
    private String treatment;
    private String prevention;

}
