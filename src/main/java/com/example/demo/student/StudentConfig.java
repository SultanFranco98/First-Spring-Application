package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.MARCH;
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sultan = new Student(
                    1L,
                    "Sultan",
                    "s.syidaliev@gmail.com",
                    LocalDate.of(1998, SEPTEMBER, 9)
            );
            Student nazar = new Student(
                    "Nazar",
                    "nazar@gmail.com",
                    LocalDate.of(1999, MARCH, 30)
            );

            repository.saveAll(
                    List.of(sultan, nazar)
            );
        };
    }
}
