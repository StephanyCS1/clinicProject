package com.clinic.backendclinic.domain.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "specialties")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String code;
    @OneToMany(mappedBy = "specialties", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Doctor> doctorListWithSpecialty;
    @OneToMany(mappedBy = "specialties", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Appointment> appointments;

}
