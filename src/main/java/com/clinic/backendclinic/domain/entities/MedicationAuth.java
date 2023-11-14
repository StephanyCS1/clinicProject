package com.clinic.backendclinic.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

@Entity
@Table(name = "medicationAutho")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicationAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany()
    @JsonBackReference
    private List<Medication> medication;
    private Integer amount;
    private String extraInformation;
}
