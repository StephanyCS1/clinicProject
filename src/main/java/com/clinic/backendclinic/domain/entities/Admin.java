package com.clinic.backendclinic.domain.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "admins")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
    private String proffession;
    private Integer yearsOfExperience;
    private byte curriculumVitae;
}
