package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "physical_examination")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhysicalExamination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer bloodPressure;
    private Integer heartbeat;
    private Integer temperature;
    private Double weight;
    private Double height;
    private String eyes;
    private String ears;
    private String nose;
    private String head;
    private String chest;
    private String arms;
    private String legs;
    private String abdomen;
    private String skeleton;
    private String muscles;
    private String neurologicalResponse;

}
