package com.example.exercises;

import java.util.Scanner;

/**
 * Exercise 2: Simple Calculator
 * 
 * Requirements:
 * 1. Take two numbers from user
 * 2. Ask for operation (+, -, *, /)
 * 3. Perform calculation and show result
 * 4. Handle division by zero
 * 
 * Learning Goals:
 * - User input validation
 * - Switch statements
 * - Error handling
 * - Mathematical operations
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===");
        System.out.println("Let's do some math! 🧮");
        
        // Get first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Get second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Get operation
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double result = 0;
        boolean validOperation = true;
        
        // Perform calculation using switch
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("\n📊 Calculation: " + num1 + " + " + num2 + " = " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("\n📊 Calculation: " + num1 + " - " + num2 + " = " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("\n📊 Calculation: " + num1 + " × " + num2 + " = " + result);
                break;
                
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("\n📊 Calculation: " + num1 + " ÷ " + num2 + " = " + result);
                } else {
                    System.out.println("\n❌ Error: Division by zero is not allowed!");
                    validOperation = false;
                }
                break;
                
            default:
                System.out.println("\n❌ Error: Invalid operation! Please use +, -, *, or /");
                validOperation = false;
        }
        
        // Additional information if calculation was successful
        if (validOperation && operation != '/') {
            System.out.println("\n=== Additional Info ===");
            
            // Check if result is positive, negative, or zero
            if (result > 0) {
                System.out.println("✅ Result is positive");
            } else if (result < 0) {
                System.out.println("➖ Result is negative");
            } else {
                System.out.println("0️⃣ Result is zero");
            }
            
            // Check if result is a whole number
            if (result == (int) result) {
                System.out.println("🔢 Result is a whole number");
            } else {
                System.out.println("🔢 Result is a decimal number");
            }
            
            // Show result rounded to 2 decimal places
            System.out.println("📐 Rounded result: " + String.format("%.2f", result));
        }
        
        System.out.println("\n🎉 Thanks for using the calculator!");
        scanner.close();
    }
}