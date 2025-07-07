package com.mrm.patientservice.service.impl;

import com.mrm.patientservice.dto.PatientResponseDTO;
import com.mrm.patientservice.entity.PatientEntity;
import com.mrm.patientservice.mapper.PatientMapper;
import com.mrm.patientservice.repository.PatientRepository;
import com.mrm.patientservice.service.PatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    public List<PatientResponseDTO> listPatients() {
        List<PatientEntity> patients = patientRepository.findAll();

        log.info("Found {} patients", patients.size());

        return patients.stream()
                .map(patientMapper::fromEntityToDto)
                .toList();
    }
}
