package com.example.exercises;

import java.util.Scanner;

/**
 * Exercise 1: Personal Information Program
 * 
 * Requirements:
 * 1. Ask for user's name, age, and favorite programming language
 * 2. Calculate birth year based on age
 * 3. Display a personalized message
 * 
 * Learning Goals:
 * - User input with Scanner
 * - Variable declarations and calculations
 * - String concatenation and formatting
 * - Conditional logic
 */
public class PersonalInfoProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Personal Information Program ===");
        System.out.println("Tell us about yourself!");
        
        // Get user input
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        
        System.out.print("Enter your favorite programming language: ");
        String favLang = scanner.nextLine();
        
        // Calculate birth year
        int currentYear = 2024;
        int birthYear = currentYear - age;
        
        // Display information
        System.out.println("\n" + "=".repeat(50));
        System.out.println("           PERSONAL PROFILE");
        System.out.println("=".repeat(50));
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Born in: " + birthYear);
        System.out.println("Favorite Language: " + favLang);
        
        // Personalized messages based on age
        System.out.println("\n=== Personalized Message ===");
        if (age < 18) {
            System.out.println("🎓 " + name + ", you're young and have a bright future in programming!");
        } else if (age >= 18 && age < 25) {
            System.out.println("🚀 " + name + ", perfect age to start a programming career!");
        } else if (age >= 25 && age < 35) {
            System.out.println("💼 " + name + ", you're in the prime time for tech leadership!");
        } else {
            System.out.println("🧙‍♂️ " + name + ", your experience is valuable in the tech world!");
        }
        
        // Special message for Java lovers
        if (favLang.toLowerCase().contains("java")) {
            System.out.println("☕ Awesome! Java is an excellent choice for backend development!");
            System.out.println("   You're going to love building APIs and web services!");
        } else {
            System.out.println("🔄 " + favLang + " is great! And you'll love Java for backend development too!");
        }
        
        // Calculate years until certain milestones
        if (age < 30) {
            int yearsTo30 = 30 - age;
            System.out.println("⏰ You have " + yearsTo30 + " years until you turn 30!");
        }
        
        System.out.println("\n🎉 Welcome to your Java backend development journey, " + name + "!");
        
        scanner.close();
    }
}