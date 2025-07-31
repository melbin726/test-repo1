package com.example.exercises;

import java.util.Scanner;

/**
 * Exercise 3: Grade Calculator
 * 
 * Requirements:
 * 1. Take 5 subject marks from user
 * 2. Calculate average
 * 3. Determine grade based on average
 * 4. Show result with appropriate message
 * 
 * Learning Goals:
 * - Arrays or multiple variables
 * - Loops for input collection
 * - Average calculation
 * - Grade determination logic
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Grade Calculator ===");
        System.out.println("Enter marks for 5 subjects (0-100) 📚");
        
        // Array to store marks
        double[] marks = new double[5];
        String[] subjects = {"Mathematics", "Science", "English", "History", "Computer Science"};
        
        // Input marks for each subject
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextDouble();
            
            // Validate marks (0-100)
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks! Please enter between 0-100: ");
                marks[i] = scanner.nextDouble();
            }
        }
        
        // Calculate total and average
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double average = total / marks.length;
        
        // Determine grade based on average
        char grade;
        String gradeDescription;
        String emoji;
        
        if (average >= 90) {
            grade = 'A';
            gradeDescription = "Excellent";
            emoji = "🌟";
        } else if (average >= 80) {
            grade = 'B';
            gradeDescription = "Good";
            emoji = "👍";
        } else if (average >= 70) {
            grade = 'C';
            gradeDescription = "Satisfactory";
            emoji = "👌";
        } else if (average >= 60) {
            grade = 'D';
            gradeDescription = "Needs Improvement";
            emoji = "⚠️";
        } else {
            grade = 'F';
            gradeDescription = "Fail";
            emoji = "❌";
        }
        
        // Display results
        System.out.println("\n" + "=".repeat(50));
        System.out.println("              GRADE REPORT");
        System.out.println("=".repeat(50));
        
        // Show individual subject marks
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-20s: %.1f%%\n", subjects[i], marks[i]);
        }
        
        System.out.println("-".repeat(50));
        System.out.printf("Total Marks: %.1f/500\n", total);
        System.out.printf("Average: %.2f%%\n", average);
        System.out.println("Grade: " + grade + " (" + gradeDescription + ") " + emoji);
        
        // Additional analysis
        System.out.println("\n=== Performance Analysis ===");
        
        // Find highest and lowest marks
        double highest = marks[0];
        double lowest = marks[0];
        String highestSubject = subjects[0];
        String lowestSubject = subjects[0];
        
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
                highestSubject = subjects[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
                lowestSubject = subjects[i];
            }
        }
        
        System.out.println("🏆 Best Subject: " + highestSubject + " (" + highest + "%)");
        System.out.println("📉 Needs Work: " + lowestSubject + " (" + lowest + "%)");
        
        // Performance message
        System.out.println("\n=== Message ===");
        if (average >= 90) {
            System.out.println("🎉 Outstanding performance! You're a star student!");
        } else if (average >= 80) {
            System.out.println("👏 Great job! Keep up the good work!");
        } else if (average >= 70) {
            System.out.println("😊 Good effort! There's room for improvement.");
        } else if (average >= 60) {
            System.out.println("🤔 You need to study harder. Focus on weak subjects.");
        } else {
            System.out.println("📚 Time to hit the books! You can do better next time.");
        }
        
        // Suggestions
        if (lowest < 60) {
            System.out.println("💡 Suggestion: Focus more on " + lowestSubject);
        }
        
        if (average < 75) {
            System.out.println("📖 Tip: Create a study schedule and practice regularly");
        }
        
        scanner.close();
    }
}