# Chapter 2: Object-Oriented Programming (OOP) 🎭

Welcome to the world of Object-Oriented Programming! This is where Java truly shines. You'll learn to think in terms of objects, classes, and relationships - the foundation of professional Java development.

## 📚 What You'll Learn

- Classes and Objects
- Constructors and Methods
- Encapsulation (private, public, protected)
- Inheritance (extending classes)
- Polymorphism (method overriding)
- Abstraction (abstract classes and interfaces)
- Static vs Instance members
- The `this` and `super` keywords

## 🎯 Why OOP Matters for Backend Development

In backend development, OOP helps you:
- **Model real-world entities** (User, Product, Order)
- **Organize code** into manageable, reusable components  
- **Build maintainable APIs** with clean architecture
- **Follow design patterns** used in frameworks like Spring
- **Create scalable applications** that are easy to extend

## 🏗 Core OOP Concepts

### 1. Classes and Objects

A **class** is a blueprint, an **object** is an instance of that class.

```java
// Class definition (blueprint)
public class Person {
    // Attributes (instance variables)
    private String name;
    private int age;
    private String email;
    
    // Constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    // Methods (behaviors)
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

// Using the class (creating objects)
public class Main {
    public static void main(String[] args) {
        // Creating objects (instances)
        Person person1 = new Person("Alice", 25, "alice@example.com");
        Person person2 = new Person("Bob", 30, "bob@example.com");
        
        // Using object methods
        person1.introduce();
        person2.introduce();
    }
}
```

### 2. Encapsulation (Data Hiding)

Encapsulation protects data by making attributes private and providing controlled access through methods.

```java
public class BankAccount {
    private double balance;    // Private - can't be accessed directly
    private String accountNumber;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    // Controlled access to balance
    public double getBalance() {
        return balance;
    }
    
    // Controlled way to modify balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }
}
```

### 3. Inheritance (IS-A Relationship)

Inheritance allows classes to inherit properties and methods from other classes.

```java
// Parent class (superclass)
public class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    
    // Method to be overridden
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

// Child class (subclass)
public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }
    
    // Override parent method
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof!");
    }
    
    // New method specific to Dog
    public void fetch() {
        System.out.println(name + " fetches the ball");
    }
}

// Another child class
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow!");
    }
    
    public void climb() {
        System.out.println(name + " climbs a tree");
    }
}
```

### 4. Polymorphism (One Interface, Many Forms)

Polymorphism allows objects of different types to be treated as objects of a common base type.

```java
public class AnimalDemo {
    public static void main(String[] args) {
        // Polymorphism in action
        Animal[] animals = {
            new Dog("Buddy", 3, "Golden Retriever"),
            new Cat("Whiskers", 2),
            new Dog("Max", 5, "German Shepherd")
        };
        
        // Same method call, different behaviors
        for (Animal animal : animals) {
            animal.makeSound();  // Calls appropriate overridden method
        }
    }
}
```

### 5. Abstraction (Hiding Implementation Details)

Abstract classes and interfaces define what a class should do, not how it should do it.

```java
// Abstract class
public abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract double calculateArea();
    
    // Concrete method - shared by all shapes
    public void displayInfo() {
        System.out.println("This is a " + color + " shape");
        System.out.println("Area: " + calculateArea());
    }
}

// Interface
public interface Drawable {
    void draw();
    default void display() {
        System.out.println("Displaying shape...");
    }
}

// Implementing abstract class and interface
public class Circle extends Shape implements Drawable {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
```

## 🏃‍♂️ Real-World Example: E-commerce System

Let's build a simple e-commerce system to see OOP in action:

```java
// Base Product class
public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;
    
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    
    public void setStock(int stock) { this.stock = stock; }
    
    public boolean isAvailable() {
        return stock > 0;
    }
}

// Specialized product types
public class Book extends Product {
    private String author;
    private String isbn;
    
    public Book(String id, String name, double price, int stock, String author, String isbn) {
        super(id, name, price, stock);
        this.author = author;
        this.isbn = isbn;
    }
    
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
}

public class Electronics extends Product {
    private int warrantyMonths;
    private String brand;
    
    public Electronics(String id, String name, double price, int stock, String brand, int warrantyMonths) {
        super(id, name, price, stock);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }
    
    public String getBrand() { return brand; }
    public int getWarrantyMonths() { return warrantyMonths; }
}

// Customer class
public class Customer {
    private String id;
    private String name;
    private String email;
    private List<Product> cart;
    
    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cart = new ArrayList<>();
    }
    
    public void addToCart(Product product) {
        if (product.isAvailable()) {
            cart.add(product);
            System.out.println("Added " + product.getName() + " to cart");
        } else {
            System.out.println("Product not available!");
        }
    }
    
    public double calculateTotal() {
        return cart.stream().mapToDouble(Product::getPrice).sum();
    }
}
```

## 🎯 Key OOP Principles for Backend Development

### 1. Single Responsibility Principle
Each class should have one reason to change.

### 2. Open/Closed Principle  
Classes should be open for extension but closed for modification.

### 3. Liskov Substitution Principle
Objects should be replaceable with instances of their subtypes.

### 4. Interface Segregation Principle
Many client-specific interfaces are better than one general-purpose interface.

### 5. Dependency Inversion Principle
Depend on abstractions, not concretions.

## 🏃‍♂️ Practical Exercises

### Exercise 1: Library Management System
Create classes for:
- Book (title, author, ISBN, available)
- Member (id, name, borrowed books)
- Library (manage books and members)

### Exercise 2: Banking System
Create classes for:
- Account (abstract base class)
- SavingsAccount (with interest rate)
- CheckingAccount (with overdraft limit)
- Customer (can have multiple accounts)

### Exercise 3: Vehicle Rental System
Create classes for:
- Vehicle (abstract base class)
- Car, Motorcycle, Truck (specific vehicles)
- Customer and RentalAgency

## 🔗 What's Next?

You've mastered the fundamentals of OOP! Next, you'll learn about [Chapter 3: Collections & Data Structures](../03-collections/README.md) where you'll work with Lists, Maps, Sets, and more advanced data handling.

## 🤔 Common OOP Mistakes

### 1. Making Everything Public
- Use private for internal data
- Provide public methods only when needed

### 2. Not Using Inheritance Properly
- Use inheritance for IS-A relationships
- Use composition for HAS-A relationships

### 3. Ignoring Encapsulation
- Don't expose internal implementation details
- Use getters/setters with validation

### 4. Overusing Inheritance
- Prefer composition over inheritance when possible
- Use interfaces for contracts

---

**🎉 Great job! You now understand OOP - the foundation of professional Java development!**