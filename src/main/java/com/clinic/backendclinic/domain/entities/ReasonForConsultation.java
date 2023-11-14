package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "reasons_consulting")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReasonForConsultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String desciption;
    private String symptoms;
    private String severity;
}
