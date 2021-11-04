package com.example.Main.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {
            Student david = new Student(
                    "David",
                    "stojani_david@hotmail.com",
                    LocalDate.of(1995, Month.JUNE,6)
            );

            Student marko = new Student(
                    "Marko>",
                    "markooo@hotmail.com",
                    LocalDate.of(1997, Month.JUNE,6)
            );

            repository.saveAll(
                    List.of(david, marko)
            );
        };
    }
}
