# Java Basics Examples

This directory contains working examples for Chapter 1: Java Basics & Environment Setup.

## 📁 Structure

```
src/main/java/com/example/
├── HelloWorld.java          # Your first Java program
├── DataTypes.java          # Variables and data types
├── ControlStructures.java  # If-else, loops, switch
├── Methods.java            # Functions and methods
├── UserInput.java          # Scanner and user input
└── exercises/
    ├── PersonalInfoProgram.java  # Exercise 1
    ├── SimpleCalculator.java     # Exercise 2
    └── GradeCalculator.java      # Exercise 3
```

## 🚀 How to Run

### Option 1: Using Java directly
```bash
# Compile a Java file
javac -d target/classes -cp src/main/java src/main/java/com/example/HelloWorld.java

# Run the compiled class
java -cp target/classes com.example.HelloWorld
```

### Option 2: Using Maven (Recommended)
```bash
# Compile all Java files
mvn compile

# Run a specific main class
mvn exec:java -Dexec.mainClass="com.example.HelloWorld"
mvn exec:java -Dexec.mainClass="com.example.DataTypes"
mvn exec:java -Dexec.mainClass="com.example.ControlStructures"
mvn exec:java -Dexec.mainClass="com.example.Methods"
mvn exec:java -Dexec.mainClass="com.example.UserInput"

# Run exercises
mvn exec:java -Dexec.mainClass="com.example.exercises.PersonalInfoProgram"
mvn exec:java -Dexec.mainClass="com.example.exercises.SimpleCalculator"
mvn exec:java -Dexec.mainClass="com.example.exercises.GradeCalculator"
```

## 📚 What Each Example Teaches

### HelloWorld.java
- Basic Java program structure
- `public static void main` method
- `System.out.println()` for output

### DataTypes.java
- Primitive data types (int, double, boolean, char, etc.)
- Reference types (String, arrays)
- Type conversion (casting)
- Variable declaration and initialization

### ControlStructures.java
- If-else statements
- For loops (regular and enhanced)
- While and do-while loops
- Switch statements
- Nested loops

### Methods.java
- Method declaration and calling
- Parameters and return values
- Method overloading
- Static methods
- Boolean methods

### UserInput.java
- Scanner class for user input
- Different input methods (nextLine, nextInt, nextDouble)
- Input buffer management
- String formatting

## 🏃‍♂️ Exercises

### Exercise 1: Personal Information Program
- Practice user input
- Variable calculations
- Conditional logic
- String operations

### Exercise 2: Simple Calculator
- Switch statements
- Mathematical operations
- Error handling (division by zero)
- Input validation

### Exercise 3: Grade Calculator
- Arrays usage
- Loops for data collection
- Average calculations
- Complex conditional logic

## 🎯 Learning Tips

1. **Start Small**: Begin with HelloWorld.java
2. **Modify Code**: Change values and see what happens
3. **Practice Typing**: Don't just copy-paste, type the code
4. **Understand Errors**: Read error messages carefully
5. **Experiment**: Try different inputs and scenarios

## 🐛 Common Issues

### "class not found"
- Make sure you're in the right directory
- Check that class name matches filename
- Verify the package structure

### "Scanner not closed"
- Always call `scanner.close()` at the end
- This prevents resource leaks

### "variable might not be initialized"
- Initialize variables before using them
- Example: `int count = 0;`

## 🎉 Next Steps

Once you've completed all examples and exercises:
1. Move to [Chapter 2: Object-Oriented Programming](../../docs/02-oop/README.md)
2. Try creating your own variations of these programs
3. Combine concepts from different examples

Happy coding! 🚀