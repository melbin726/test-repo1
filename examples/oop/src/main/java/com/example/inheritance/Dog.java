package com.example.inheritance;

/**
 * Dog class extending Animal - demonstrates inheritance
 */
public class Dog extends Animal {
    private String breed;
    private boolean isTrained;
    
    // Constructor - calls parent constructor using super()
    public Dog(String name, int age, String breed) {
        super(name, age, "Canine");  // Call parent constructor
        this.breed = breed;
        this.isTrained = false;
        System.out.println("🐕 Dog specific initialization complete");
    }
    
    // Constructor with training status
    public Dog(String name, int age, String breed, boolean isTrained) {
        super(name, age, "Canine");
        this.breed = breed;
        this.isTrained = isTrained;
        System.out.println("🐕 Dog specific initialization complete");
    }
    
    // Override parent method - polymorphism
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof! 🐕");
    }
    
    @Override
    public void move() {
        System.out.println(name + " runs around happily 🏃‍♂️");
    }
    
    // New methods specific to Dog
    public void fetch() {
        System.out.println(name + " fetches the ball! 🎾");
    }
    
    public void wagTail() {
        System.out.println(name + " wags tail excitedly! 🐕‍🦺");
    }
    
    public void sit() {
        if (isTrained) {
            System.out.println(name + " sits like a good dog! 🐕");
        } else {
            System.out.println(name + " doesn't know how to sit yet 🤷‍♂️");
        }
    }
    
    public void train() {
        if (!isTrained) {
            isTrained = true;
            System.out.println(name + " has been trained! Good dog! 🎓");
        } else {
            System.out.println(name + " is already trained! 🏆");
        }
    }
    
    public void guard() {
        System.out.println(name + " is guarding the house! 🏠👮‍♂️");
    }
    
    // Override displayInfo to add dog-specific information
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent method
        System.out.println("Breed: " + breed);
        System.out.println("Trained: " + (isTrained ? "Yes ✅" : "No ❌"));
    }
    
    // Override isAdult for dogs (different adult age)
    @Override
    public boolean isAdult() {
        return age >= 1; // Dogs mature faster
    }
    
    // Getters for dog-specific attributes
    public String getBreed() { return breed; }
    public boolean isTrained() { return isTrained; }
}