package ru.javaguru.exercises.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.javaguru.exercises.dto.ExerciseDto;
import ru.javaguru.exercises.service.ExerciseService;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExerciseDto> getExerciseById(@PathVariable Long id) {
        ExerciseDto exerciseDto = exerciseService.getExerciseById(id);
        return ResponseEntity.ok(exerciseDto);
    }
}