package com.example.todoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for Todo API
 * This is the entry point of our Spring Boot application
 */
@SpringBootApplication
public class TodoApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoApiApplication.class, args);
        System.out.println("🚀 Todo API is running!");
        System.out.println("📱 Access the API at: http://localhost:8080");
        System.out.println("💾 Database console: http://localhost:8080/h2-console");
    }
}