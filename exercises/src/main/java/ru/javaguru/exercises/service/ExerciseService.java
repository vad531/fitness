package ru.javaguru.exercises.service;

import org.springframework.stereotype.Service;
import ru.javaguru.exercises.dto.ExerciseDto;
import ru.javaguru.exercises.mapper.ExerciseMapper;
import ru.javaguru.exercises.model.Exercise;
import ru.javaguru.exercises.repository.ExerciseRepository;

@Service
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;
    private final ExerciseMapper exerciseMapper;

    public ExerciseService(ExerciseRepository exerciseRepository, ExerciseMapper exerciseMapper) {
        this.exerciseRepository = exerciseRepository;
        this.exerciseMapper = exerciseMapper;
    }

    public ExerciseDto getExerciseById(Long id) {
        Exercise exercise = exerciseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Упражнение с id " + id + " не найдено"));
        return exerciseMapper.toDto(exercise);
    }
}