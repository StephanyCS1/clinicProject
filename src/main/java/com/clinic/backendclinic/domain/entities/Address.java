package com.clinic.backendclinic.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetNumber;
    private String postalCode;
    private String city;
    private String departmet;
    private String houseNumber;
    private String additionalInfo;


}
