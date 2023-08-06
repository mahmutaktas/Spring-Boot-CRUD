package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mahmut = new Student(
                    "Mahmut", "test.test@gmail.com", LocalDate.of(2000, 12, 12)
            );

            Student alex = new Student(
                    "Alex", "alex.alex@gmail.com", LocalDate.of(1997, 12, 12)
            );

            repository.saveAllAndFlush(
                    List.of(mahmut, alex)
            );
        };
    }
}
