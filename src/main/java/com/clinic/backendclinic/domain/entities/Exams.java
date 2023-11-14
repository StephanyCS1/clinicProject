package com.clinic.backendclinic.domain.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "exams")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Exams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private String description;
    private String company;
}
