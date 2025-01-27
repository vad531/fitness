package ru.javaguru.fitnessprograms.dto;


public class FitnessProgramDto {

    private Long programId;
    private Long userId;
    private ExerciseDto exercise;
    private Integer repetitions;
    private Integer sets;

    public FitnessProgramDto() {}

    public FitnessProgramDto(Long programId, Long userId, ExerciseDto exercise, Integer repetitions, Integer sets) {
        this.programId = programId;
        this.userId = userId;
        this.exercise = exercise;
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

    public ExerciseDto getExercise() {
        return exercise;
    }

    public void setExercise(ExerciseDto exercise) {
        this.exercise = exercise;
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