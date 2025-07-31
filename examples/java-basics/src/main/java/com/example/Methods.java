package com.example;

public class Methods {
    public static void main(String[] args) {
        System.out.println("=== Method Examples ===");
        
        // Call methods without return values
        greetUser("Alice");
        greetUser("Bob");
        
        // Call methods with return values
        int sum = addNumbers(10, 20);
        System.out.println("Sum of 10 and 20: " + sum);
        
        int product = multiplyNumbers(5, 7);
        System.out.println("Product of 5 and 7: " + product);
        
        // Method with multiple parameters
        double area = calculateRectangleArea(5.0, 3.0);
        System.out.println("Rectangle area (5x3): " + area);
        
        double circleArea = calculateCircleArea(5.0);
        System.out.println("Circle area (radius 5): " + String.format("%.2f", circleArea));
        
        // Method returning boolean
        boolean isEven = isEvenNumber(8);
        System.out.println("Is 8 even? " + isEven);
        
        boolean isPositive = isPositiveNumber(-5);
        System.out.println("Is -5 positive? " + isPositive);
        
        // Method with string operations
        String reversed = reverseString("Hello");
        System.out.println("Reversed 'Hello': " + reversed);
        
        // Method with array parameter
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        System.out.println("Average of array: " + average);
        
        // Method that calls other methods
        displayUserInfo("John", 25, 75000.0);
    }
    
    // Method with no return value (void)
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming!");
    }
    
    // Method with return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    // Method with multiple parameters and return value
    public static int multiplyNumbers(int x, int y) {
        int result = x * y;
        System.out.println("Calculating: " + x + " × " + y + " = " + result);
        return result;
    }
    
    // Method with double parameters
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    // Method using Math library
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Method returning boolean
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
    
    // Another boolean method
    public static boolean isPositiveNumber(int number) {
        return number > 0;
    }
    
    // Method with string manipulation
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
    
    // Method with array parameter
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        return (double) sum / numbers.length;
    }
    
    // Method that uses other methods
    public static void displayUserInfo(String name, int age, double salary) {
        System.out.println("\n=== User Information ===");
        greetUser(name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        
        // Calculate and display birth year
        int currentYear = 2024;
        int birthYear = currentYear - age;
        System.out.println("Estimated birth year: " + birthYear);
        
        // Check if salary is above average
        double averageSalary = 50000.0;
        if (salary > averageSalary) {
            System.out.println("Above average salary! 💰");
        } else {
            System.out.println("Below average salary");
        }
    }
    
    // Method overloading example
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static int findMax(int a, int b, int c) {
        return findMax(findMax(a, b), c);
    }
    
    public static double findMax(double a, double b) {
        return (a > b) ? a : b;
    }
}