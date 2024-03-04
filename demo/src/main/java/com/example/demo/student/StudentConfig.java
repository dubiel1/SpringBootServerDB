package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

  @SuppressWarnings("null")
  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student idan = new Student(
				"Idan",
				"idan.guzu@gmail.com",
				LocalDate.of(2009, Month.SEPTEMBER, 26)
			);
      Student shahar = new Student(
				"Shahar",
				"shaharlele@gmail.com",
				LocalDate.of(2018, Month.APRIL, 7)
			);
      
      repository.saveAll(
        List.of(idan, shahar)
      );
    };
  }
}
