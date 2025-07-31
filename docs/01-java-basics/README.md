# Chapter 1: Java Basics & Environment Setup 🎯

Welcome to your Java backend development journey! In this chapter, you'll set up your development environment and learn the fundamentals of Java programming.

## 📚 What You'll Learn

- Set up Java development environment
- Understand Java basics: variables, data types, operators
- Control structures: if-else, loops
- Methods and functions
- Basic input/output operations
- Your first Java program!

## 🛠 Environment Setup

### 1. Install Java Development Kit (JDK)

**Windows/Mac/Linux:**
1. Download JDK 17 or later from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
2. Install following the installer instructions
3. Verify installation:
   ```bash
   java --version
   javac --version
   ```

### 2. Install an IDE

**Recommended: IntelliJ IDEA Community Edition**
- Download from [JetBrains](https://www.jetbrains.com/idea/download/)
- Free and powerful
- Great for beginners and professionals

**Alternative: Visual Studio Code**
- Download from [VS Code](https://code.visualstudio.com/)
- Install Java Extension Pack

### 3. Install Maven (Build Tool)
- Download from [Apache Maven](https://maven.apache.org/download.cgi)
- Add to your system PATH
- Verify: `mvn --version`

## 🏗 Java Project Structure

A typical Java project looks like this:
```
my-java-project/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── Main.java
├── pom.xml (Maven configuration)
└── README.md
```

## 📖 Java Fundamentals

### 1. Your First Java Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java Backend Developer! 🚀");
    }
}
```

**Key Points:**
- `public class` - Defines a public class
- `static` - Method belongs to the class, not instance
- `void` - Method doesn't return anything
- `main` - Entry point of Java application
- `String[] args` - Command line arguments

### 2. Variables and Data Types

```java
public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        int age = 25;                    // Integer
        double salary = 50000.50;        // Decimal number
        boolean isEmployed = true;       // Boolean
        char grade = 'A';               // Single character
        
        // Reference Types
        String name = "John Doe";        // String
        String[] skills = {"Java", "Spring", "MySQL"};
        
        // Print values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Grade: " + grade);
    }
}
```

### 3. Control Structures

```java
public class ControlStructures {
    public static void main(String[] args) {
        int score = 85;
        
        // If-else statement
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // For loop
        System.out.println("Numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        // While loop
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // Switch statement
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of work week!");
                break;
            case "Friday":
                System.out.println("TGIF!");
                break;
            default:
                System.out.println("Regular day");
        }
    }
}
```

### 4. Methods (Functions)

```java
public class Methods {
    public static void main(String[] args) {
        // Call methods
        greetUser("Alice");
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum);
        
        double area = calculateCircleArea(5.0);
        System.out.println("Circle area: " + area);
    }
    
    // Method with no return value
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    // Method with return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    // Method with parameters and return value
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
```

### 5. User Input

```java
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        
        System.out.println("\\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        
        scanner.close();
    }
}
```

## 🏃‍♂️ Practical Exercises

### Exercise 1: Personal Information Program
Create a program that:
1. Asks for user's name, age, and favorite programming language
2. Calculates birth year based on age
3. Displays a personalized message

### Exercise 2: Simple Calculator
Create a calculator that:
1. Takes two numbers from user
2. Asks for operation (+, -, *, /)
3. Performs calculation and shows result
4. Handles division by zero

### Exercise 3: Grade Calculator
Create a program that:
1. Takes 5 subject marks from user
2. Calculates average
3. Determines grade based on average
4. Shows result with appropriate message

## 🎯 Key Takeaways

- Java is a statically-typed, object-oriented language
- Every Java program starts with a `main` method
- Variables must be declared with specific types
- Methods help organize and reuse code
- Control structures control program flow
- Always close resources like Scanner

## 🔗 What's Next?

Ready for the next level? Continue with [Chapter 2: Object-Oriented Programming](../02-oop/README.md) where you'll learn about classes, objects, and the core principles of OOP!

## 🤔 Common Errors & Solutions

### Error: "class not found"
- Make sure your file name matches the class name
- Check that you're in the correct directory

### Error: "variable not initialized"
- Initialize variables before using them
- Example: `int count = 0;`

### Error: "Scanner not closed"
- Always call `scanner.close()` after use
- This prevents resource leaks

---

**🎉 Congratulations! You've completed Chapter 1. Time to build some cool stuff!**