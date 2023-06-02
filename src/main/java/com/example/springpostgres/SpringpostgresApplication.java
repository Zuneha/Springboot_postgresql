package com.example.springpostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringpostgresApplication implements CommandLineRunner {

    private final StudentService studentService;

    @Autowired
    public SpringpostgresApplication(StudentService studentService) {
        this.studentService = studentService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringpostgresApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // This line will insert a new student into the database when the application starts
        studentService.insertStudent();
    }
}