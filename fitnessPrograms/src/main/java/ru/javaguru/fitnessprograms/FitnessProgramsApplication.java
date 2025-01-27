package ru.javaguru.fitnessprograms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FitnessProgramsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitnessProgramsApplication.class, args);
    }

}
