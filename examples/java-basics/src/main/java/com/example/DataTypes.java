package com.example;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        int age = 25;                    // Integer
        double salary = 50000.50;        // Decimal number
        boolean isEmployed = true;       // Boolean
        char grade = 'A';               // Single character
        long population = 1000000L;      // Large integer
        float percentage = 85.5f;        // Single precision decimal
        byte byteValue = 100;           // Small integer
        short shortValue = 1000;        // Medium integer
        
        // Reference Types
        String name = "John Doe";        // String
        String[] skills = {"Java", "Spring", "MySQL", "REST APIs"};
        
        // Print values
        System.out.println("=== Personal Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Grade: " + grade);
        System.out.println("Population: " + population);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        
        System.out.println("\n=== Skills ===");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }
        
        // Demonstrating type conversion
        System.out.println("\n=== Type Conversion ===");
        int intValue = 100;
        double doubleValue = intValue; // Automatic conversion (widening)
        System.out.println("Int to Double: " + intValue + " -> " + doubleValue);
        
        double bigDouble = 123.45;
        int convertedInt = (int) bigDouble; // Manual conversion (narrowing)
        System.out.println("Double to Int: " + bigDouble + " -> " + convertedInt);
    }
}