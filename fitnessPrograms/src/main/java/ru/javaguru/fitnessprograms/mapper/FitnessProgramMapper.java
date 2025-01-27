package ru.javaguru.fitnessprograms.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;
import ru.javaguru.fitnessprograms.dto.FitnessProgramDto;
import ru.javaguru.fitnessprograms.model.FitnessProgram;

@Component
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface FitnessProgramMapper {

    FitnessProgramDto toDto(FitnessProgram fitnessProgram);

    FitnessProgram toEntity(FitnessProgramDto fitnessProgramDto);
}