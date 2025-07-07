package com.mrm.patientservice.service;


import com.mrm.patientservice.dto.PatientResponseDTO;

import java.util.List;

public interface PatientService {

    List<PatientResponseDTO> listPatients();

}
