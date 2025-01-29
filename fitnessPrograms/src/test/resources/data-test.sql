CREATE TABLE fitness_program (
                                 program_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                 user_id BIGINT NOT NULL,
                                 exercise_id BIGINT NOT NULL,
                                 repetitions INT NOT NULL,
                                 sets INT NOT NULL
);