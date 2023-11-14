package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "patients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
    @OneToMany(mappedBy = "patients", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Appointment> appointmentList;
    @OneToMany(mappedBy = "patients", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Authorization> authorizationList;
    @OneToMany(mappedBy = "patients", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<MedicationAuth> medicationList;
    @OneToMany(mappedBy = "patients", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ClinicalHistory> clinicHistoryList;
}
