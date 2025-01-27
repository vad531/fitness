package ru.javaguru.exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "ru.javaguru.exercises")
public class ExercisesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExercisesApplication.class, args);
    }

}
