CREATE TABLE exercise (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          muscle_group VARCHAR(255),
                          description VARCHAR(255)
);

INSERT INTO exercise (name, muscle_group, description)
VALUES
('Жим лёжа', 'Грудные мышцы', 'Выполняется на горизонтальной скамье с использованием штанги.'),
('Приседания', 'Квадрицепсы', 'Классическое упражнение для тренировки ног.');