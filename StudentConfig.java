package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student samar=new Student(

                    "Samar",
                    "samar@gmail.com",
                    LocalDate.of(2000,APRIL, 3)
            );
            Student simha=new Student(
                    "simha",
                    "abc@gmail.com",
                    LocalDate.of(2001,APRIL, 3)
            );
            Student samar1=new Student(

                    "Samaedfft12",
                    "samaasdfasdfr@gmail.com",
                    LocalDate.of(2010,APRIL, 3)
            );
        repository.saveAll(List.of(samar,simha,samar1));
        };
    }
}
