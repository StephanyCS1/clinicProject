package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "habits")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Habit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String habitName;
    private String description;
    private String frecuency;
    private String intensity;
    private String notes;
}
