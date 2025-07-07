package com.mrm.patientservice.controller;

import com.mrm.patientservice.dto.PatientResponseDTO;
import com.mrm.patientservice.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    private final PatientService patientService;

    @GetMapping
    public ResponseEntity<List<PatientResponseDTO>> listPatients() {
        List<PatientResponseDTO> patients = patientService.listPatients();
        return ResponseEntity.ok().body(patients);
    }

}
