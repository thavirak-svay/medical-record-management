package com.mrm.patientservice.dto;

import lombok.Data;

@Data
public class PatientResponseDTO {

    private String id;

    private String patientCode;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String address;

    private String dateOfBirth;
}
