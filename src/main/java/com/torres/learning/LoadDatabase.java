package com.torres.learning;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){
        return args -> {
            repository.save(new Employee("Bilbo Baggins", "burglar"));
            repository.save(new Employee("Frodo Baggins", "thief"));
        };
    }
}
