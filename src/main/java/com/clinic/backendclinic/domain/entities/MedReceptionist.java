package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "receptionists")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedReceptionist extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
}
