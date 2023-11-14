package com.clinic.backendclinic.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "appointments")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name ="specialty_id")
    private Specialty specialty;

    @ManyToOne()
    @JsonBackReference
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne()
    @JsonBackReference
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne()
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    private LocalDate appoinmentDate;
    private boolean activeAppoinment;

}
