package com.example.inheritance;

/**
 * Base Animal class demonstrating inheritance concepts
 */
public class Animal {
    // Protected - accessible by subclasses
    protected String name;
    protected int age;
    protected String species;
    
    // Constructor
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        System.out.println("🐾 Animal created: " + name);
    }
    
    // Methods that can be inherited
    public void eat() {
        System.out.println(name + " is eating... 🍽️");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping... 😴");
    }
    
    public void breathe() {
        System.out.println(name + " is breathing... 💨");
    }
    
    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
    
    // Method to be overridden
    public void move() {
        System.out.println(name + " is moving");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Species: " + species);
    }
    
    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getSpecies() { return species; }
    
    // Method to check if animal is adult
    public boolean isAdult() {
        return age >= 2; // Default adult age
    }
}