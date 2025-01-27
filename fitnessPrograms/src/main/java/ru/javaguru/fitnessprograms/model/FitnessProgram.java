package ru.javaguru.fitnessprograms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FitnessProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long programId;

    private Long userId;
    private Long exerciseId;
    private Integer repetitions;
    private Integer sets;

    public FitnessProgram() {}

    public FitnessProgram(Long programId, Long userId, Long exerciseId, Integer repetitions, Integer sets) {
        this.programId = programId;
        this.userId = userId;
        this.exerciseId = exerciseId;
        this.repetitions = repetitions;
        this.sets = sets;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Integer getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(Integer repetitions) {
        this.repetitions = repetitions;
    }

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }
}