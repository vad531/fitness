package ru.javaguru.exercises.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;
import ru.javaguru.exercises.dto.ExerciseDto;
import ru.javaguru.exercises.model.Exercise;

@Component
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface ExerciseMapper {

    ExerciseDto toDto(Exercise exercise);

    Exercise toEntity(ExerciseDto exerciseDto);
}

