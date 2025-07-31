package com.example.inheritance;

/**
 * Cat class extending Animal - demonstrates inheritance
 */
public class Cat extends Animal {
    private boolean isIndoor;
    private int livesRemaining;
    
    // Constructor
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age, "Feline");
        this.isIndoor = isIndoor;
        this.livesRemaining = 9; // Cats have 9 lives!
        System.out.println("🐱 Cat specific initialization complete");
    }
    
    // Override parent methods
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Purr... 🐱");
    }
    
    @Override
    public void move() {
        System.out.println(name + " moves gracefully and silently 🐾");
    }
    
    // Cat-specific methods
    public void purr() {
        System.out.println(name + " purrs contentedly... Purrrr 😻");
    }
    
    public void scratch() {
        System.out.println(name + " scratches the furniture! 🪑💥");
    }
    
    public void climb() {
        System.out.println(name + " climbs up high! 🌳");
    }
    
    public void hunt() {
        if (!isIndoor) {
            System.out.println(name + " goes hunting! 🐭");
        } else {
            System.out.println(name + " hunts toys inside the house! 🧸");
        }
    }
    
    public void nap() {
        System.out.println(name + " takes a cat nap... 😴 (Cats sleep 12-16 hours a day!)");
    }
    
    public void loseLife() {
        if (livesRemaining > 1) {
            livesRemaining--;
            System.out.println(name + " lost a life! " + livesRemaining + " lives remaining 💀");
        } else {
            System.out.println(name + " is on their last life! Be careful! ⚠️");
        }
    }
    
    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Indoor Cat: " + (isIndoor ? "Yes 🏠" : "No 🌍"));
        System.out.println("Lives Remaining: " + livesRemaining + "/9 ❤️");
    }
    
    // Override isAdult for cats
    @Override
    public boolean isAdult() {
        return age >= 1; // Cats mature at 1 year
    }
    
    // Getters
    public boolean isIndoor() { return isIndoor; }
    public int getLivesRemaining() { return livesRemaining; }
}