package com.mrm.patientservice.mapper;


import com.mrm.patientservice.dto.PatientResponseDTO;
import com.mrm.patientservice.entity.PatientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
public interface PatientMapper {

    PatientResponseDTO fromEntityToDto(PatientEntity entity);
}
