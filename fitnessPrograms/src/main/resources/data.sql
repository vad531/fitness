CREATE TABLE fitness_program (
                                 program_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                 user_id BIGINT NOT NULL,
                                 exercise_id BIGINT NOT NULL,
                                 repetitions INT NOT NULL,
                                 sets INT NOT NULL,
                                 FOREIGN KEY (exercise_id) REFERENCES exercise (id)
);

INSERT INTO fitness_program (user_id, exercise_id, repetitions, sets)
VALUES (20, 1, 12, 3);