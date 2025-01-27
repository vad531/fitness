package ru.javaguru.fitnessprograms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.javaguru.fitnessprograms.dto.FitnessProgramDto;
import ru.javaguru.fitnessprograms.service.FitnessProgramService;

@RestController
@RequestMapping("/programs")
public class FitnessProgramController {

    private final FitnessProgramService fitnessProgramService;

    public FitnessProgramController(FitnessProgramService fitnessProgramService) {
        this.fitnessProgramService = fitnessProgramService;
    }

    @GetMapping("/{programId}")
    public ResponseEntity<FitnessProgramDto> getFitnessProgramById(@PathVariable Long programId) {
        FitnessProgramDto fitnessProgramDto = fitnessProgramService.getFitnessProgramById(programId);
        return ResponseEntity.ok(fitnessProgramDto);
    }
}