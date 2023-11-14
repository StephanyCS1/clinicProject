package com.clinic.backendclinic.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "hospitals")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

    @OneToOne(mappedBy = "hospitals", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonBackReference
    private Admin admin;

    @OneToMany(mappedBy = "hospitals", cascade = CascadeType.ALL, orphanRemoval =true)
    @JsonBackReference
    private List<Doctor> doctors;

    @OneToMany(mappedBy = "hospitals", cascade = CascadeType.ALL, orphanRemoval =true)
    @JsonBackReference
    private List<Patient> patients;

    private Address address;
}
