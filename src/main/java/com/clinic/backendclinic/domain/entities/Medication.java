package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medications")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String medicationName;
    private Double dosis;
}
