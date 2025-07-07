package com.mrm.patientservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = PatientEntity.TABLE_NAME)
public class PatientEntity extends AuditEntity {

    static final String TABLE_NAME = "patients";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    private String familyName;

    @NotNull
    private String givenName;

    @NotNull
    @Email
    @Column(unique = true)
    private String email;

    @NotNull
    @Column(unique = true)
    private String patientCode;

    @NotNull
    @Column(unique = true)
    private String phoneNumber;

    @NotNull
    private String address;

    @NotNull
    private LocalDate dateOfBirth;

}
