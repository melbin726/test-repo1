package com.example;

public class ControlStructures {
    public static void main(String[] args) {
        int score = 85;
        String studentName = "Alice";
        
        System.out.println("=== Grade Calculator ===");
        System.out.println("Student: " + studentName);
        System.out.println("Score: " + score);
        
        // If-else statement
        String grade;
        if (score >= 90) {
            grade = "A";
            System.out.println("Excellent work!");
        } else if (score >= 80) {
            grade = "B";
            System.out.println("Good job!");
        } else if (score >= 70) {
            grade = "C";
            System.out.println("Satisfactory");
        } else if (score >= 60) {
            grade = "D";
            System.out.println("Needs improvement");
        } else {
            grade = "F";
            System.out.println("Must retake");
        }
        System.out.println("Grade: " + grade);
        
        System.out.println("\n=== Loop Examples ===");
        
        // For loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        
        // Enhanced for loop (for-each)
        String[] subjects = {"Math", "Science", "English", "History"};
        System.out.println("\nSubjects:");
        for (String subject : subjects) {
            System.out.println("- " + subject);
        }
        
        // While loop
        System.out.println("\nCountdown:");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("Count: " + countdown);
            countdown--;
        }
        System.out.println("Blast off! 🚀");
        
        // Do-while loop
        System.out.println("\nDo-while example:");
        int number = 1;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <= 3);
        
        // Switch statement
        System.out.println("\n=== Day of Week ===");
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of work week! Time to code!");
                break;
            case "Tuesday":
                System.out.println("Getting into the groove");
                break;
            case "Wednesday":
                System.out.println("Hump day!");
                break;
            case "Thursday":
                System.out.println("Almost there");
                break;
            case "Friday":
                System.out.println("TGIF! 🎉");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend vibes!");
                break;
            default:
                System.out.println("Unknown day");
        }
        
        // Nested loops example
        System.out.println("\n=== Multiplication Table ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println(); // New line after each row
        }
    }
}