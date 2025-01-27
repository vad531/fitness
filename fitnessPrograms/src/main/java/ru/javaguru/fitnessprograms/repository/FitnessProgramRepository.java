package ru.javaguru.fitnessprograms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javaguru.fitnessprograms.model.FitnessProgram;

@Repository
public interface FitnessProgramRepository extends JpaRepository<FitnessProgram, Long> {
}