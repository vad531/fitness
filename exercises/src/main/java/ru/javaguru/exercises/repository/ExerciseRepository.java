package ru.javaguru.exercises.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javaguru.exercises.model.Exercise;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}