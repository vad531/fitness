package ru.javaguru.fitnessprograms.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.javaguru.fitnessprograms.dto.ExerciseDto;
import ru.javaguru.fitnessprograms.dto.FitnessProgramDto;
import ru.javaguru.fitnessprograms.mapper.FitnessProgramMapper;
import ru.javaguru.fitnessprograms.model.FitnessProgram;
import ru.javaguru.fitnessprograms.repository.FitnessProgramRepository;

@Service
public class FitnessProgramService {

    private final FitnessProgramRepository fitnessProgramRepository;
    private final FitnessProgramMapper fitnessProgramMapper;
    private final RestTemplate restTemplate;

    public FitnessProgramService(FitnessProgramRepository fitnessProgramRepository,
                                 FitnessProgramMapper fitnessProgramMapper,
                                 RestTemplate restTemplate) {
        this.fitnessProgramRepository = fitnessProgramRepository;
        this.fitnessProgramMapper = fitnessProgramMapper;
        this.restTemplate = restTemplate;
    }

    public FitnessProgramDto getFitnessProgramById(Long programId) {
        FitnessProgram fitnessProgram = fitnessProgramRepository.findById(programId)
                .orElseThrow(() -> new RuntimeException("Программа с id " + programId + " не найдена"));

        ExerciseDto exerciseDto = restTemplate.getForObject(
                "http://exercises-service/exercises/" + fitnessProgram.getExerciseId(),
                ExerciseDto.class);

        FitnessProgramDto fitnessProgramDto = fitnessProgramMapper.toDto(fitnessProgram);
        fitnessProgramDto.setExercise(exerciseDto);
        return fitnessProgramDto;
    }
}