package com.example;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Personal Information Collector ===");
        System.out.println("Let's get to know you better!");
        
        // Get user's basic information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Are you employed? (true/false): ");
        boolean isEmployed = scanner.nextBoolean();
        
        // Clear the buffer
        scanner.nextLine();
        
        System.out.print("Enter your favorite programming language: ");
        String favoriteLang = scanner.nextLine();
        
        // Calculate birth year
        int currentYear = 2024;
        int birthYear = currentYear - age;
        
        // Display collected information
        System.out.println("\n" + "=".repeat(40));
        System.out.println("       USER INFORMATION SUMMARY");
        System.out.println("=".repeat(40));
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("Employment Status: " + (isEmployed ? "Employed ✅" : "Unemployed ❌"));
        System.out.println("Favorite Language: " + favoriteLang);
        
        // Provide some insights
        System.out.println("\n=== Insights ===");
        
        if (age < 18) {
            System.out.println("🎓 You're quite young! Great time to learn programming!");
        } else if (age < 30) {
            System.out.println("🚀 Perfect age to build a strong programming career!");
        } else if (age < 50) {
            System.out.println("💼 Great experience level for senior positions!");
        } else {
            System.out.println("🧠 Wisdom and experience - valuable assets in tech!");
        }
        
        if (salary > 100000) {
            System.out.println("💰 Excellent salary! You're doing great!");
        } else if (salary > 50000) {
            System.out.println("💵 Good salary! Keep growing your skills!");
        } else {
            System.out.println("📈 There's room for growth! Keep learning!");
        }
        
        if (favoriteLang.toLowerCase().contains("java")) {
            System.out.println("☕ Excellent choice! Java is perfect for backend development!");
        } else {
            System.out.println("🔄 " + favoriteLang + " is great, but you're about to love Java too!");
        }
        
        System.out.println("\n🎉 Thank you, " + name + "! Ready to become a Java backend expert?");
        
        scanner.close();
    }
}