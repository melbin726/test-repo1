package com.example.inheritance;

/**
 * Bird class extending Animal - demonstrates inheritance
 */
public class Bird extends Animal {
    private boolean canFly;
    private double wingSpan;
    
    // Constructor
    public Bird(String name, int age, boolean canFly, double wingSpan) {
        super(name, age, "Avian");
        this.canFly = canFly;
        this.wingSpan = wingSpan;
        System.out.println("🐦 Bird specific initialization complete");
    }
    
    // Override parent methods
    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet! Tweet! 🐦");
    }
    
    @Override
    public void move() {
        if (canFly) {
            System.out.println(name + " flies gracefully through the sky! 🕊️");
        } else {
            System.out.println(name + " hops and walks on the ground 🐧");
        }
    }
    
    // Bird-specific methods
    public void fly() {
        if (canFly) {
            System.out.println(name + " soars high in the sky! ✈️");
        } else {
            System.out.println(name + " cannot fly, but tries anyway! 🐧");
        }
    }
    
    public void buildNest() {
        System.out.println(name + " builds a cozy nest! 🏠");
    }
    
    public void layEggs() {
        System.out.println(name + " lays eggs! 🥚");
    }
    
    public void migrate() {
        if (canFly) {
            System.out.println(name + " migrates to warmer climates! 🌍");
        } else {
            System.out.println(name + " stays in the same area year-round 🏡");
        }
    }
    
    public void preen() {
        System.out.println(name + " preens their feathers! ✨");
    }
    
    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Can Fly: " + (canFly ? "Yes ✈️" : "No 🚶‍♂️"));
        System.out.println("Wing Span: " + wingSpan + " inches 📏");
    }
    
    // Override isAdult for birds
    @Override
    public boolean isAdult() {
        return age >= 1; // Birds mature quickly
    }
    
    // Getters
    public boolean canFly() { return canFly; }
    public double getWingSpan() { return wingSpan; }
}