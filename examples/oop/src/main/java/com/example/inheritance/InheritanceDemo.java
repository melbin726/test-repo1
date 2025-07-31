package com.example.inheritance;

/**
 * Demo class to show inheritance and polymorphism in action
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Inheritance and Polymorphism Demo ===\n");
        
        // Creating different animal objects
        System.out.println("1. Creating Animal Objects:");
        System.out.println("-".repeat(30));
        
        Dog dog = new Dog("Buddy", 3, "Golden Retriever", true);
        Cat cat = new Cat("Whiskers", 2, true);
        Bird bird = new Bird("Tweety", 1, true, 8.5);
        
        System.out.println();
        
        // Demonstrating inherited methods (same for all)
        System.out.println("2. Common Inherited Behaviors:");
        System.out.println("-".repeat(35));
        
        dog.eat();
        cat.eat();
        bird.eat();
        
        System.out.println();
        
        dog.sleep();
        cat.sleep();
        bird.sleep();
        
        // Demonstrating method overriding (polymorphism)
        System.out.println("\n3. Overridden Methods (Polymorphism):");
        System.out.println("-".repeat(40));
        
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        
        System.out.println();
        
        dog.move();
        cat.move();
        bird.move();
        
        // Demonstrating unique methods for each class
        System.out.println("\n4. Class-Specific Methods:");
        System.out.println("-".repeat(28));
        
        System.out.println("Dog-specific behaviors:");
        dog.fetch();
        dog.wagTail();
        dog.sit();
        dog.guard();
        
        System.out.println("\nCat-specific behaviors:");
        cat.purr();
        cat.scratch();
        cat.climb();
        cat.hunt();
        cat.nap();
        
        System.out.println("\nBird-specific behaviors:");
        bird.fly();
        bird.buildNest();
        bird.layEggs();
        bird.preen();
        
        // Displaying detailed information
        System.out.println("\n5. Detailed Animal Information:");
        System.out.println("-".repeat(35));
        
        System.out.println("🐕 DOG INFO:");
        dog.displayInfo();
        
        System.out.println("\n🐱 CAT INFO:");
        cat.displayInfo();
        
        System.out.println("\n🐦 BIRD INFO:");
        bird.displayInfo();
        
        // Demonstrating polymorphism with arrays
        System.out.println("\n6. Polymorphism with Arrays:");
        System.out.println("-".repeat(32));
        
        Animal[] animals = {dog, cat, bird};
        
        System.out.println("All animals making sounds:");
        for (Animal animal : animals) {
            animal.makeSound(); // Calls appropriate overridden method
        }
        
        System.out.println("\nAll animals moving:");
        for (Animal animal : animals) {
            animal.move(); // Calls appropriate overridden method
        }
        
        System.out.println("\nAll animals eating:");
        for (Animal animal : animals) {
            animal.eat(); // Calls inherited method
        }
        
        // Checking adult status
        System.out.println("\n7. Adult Status Check:");
        System.out.println("-".repeat(22));
        
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " is " + 
                             (animal.isAdult() ? "an adult" : "young") + 
                             " (" + animal.getAge() + " years old)");
        }
        
        // Demonstrating type checking and casting
        System.out.println("\n8. Type Checking and Casting:");
        System.out.println("-".repeat(32));
        
        for (Animal animal : animals) {
            System.out.println("Processing " + animal.getName() + ":");
            
            if (animal instanceof Dog) {
                Dog dogRef = (Dog) animal;
                System.out.println("  - It's a dog of breed: " + dogRef.getBreed());
                System.out.println("  - Trained: " + dogRef.isTrained());
            } else if (animal instanceof Cat) {
                Cat catRef = (Cat) animal;
                System.out.println("  - It's a cat with " + catRef.getLivesRemaining() + " lives remaining");
                System.out.println("  - Indoor cat: " + catRef.isIndoor());
            } else if (animal instanceof Bird) {
                Bird birdRef = (Bird) animal;
                System.out.println("  - It's a bird with " + birdRef.getWingSpan() + " inch wingspan");
                System.out.println("  - Can fly: " + birdRef.canFly());
            }
        }
        
        // Advanced interaction
        System.out.println("\n9. Advanced Animal Interactions:");
        System.out.println("-".repeat(35));
        
        // Train the dog
        dog.train();
        dog.sit(); // Now it should work
        
        // Cat loses a life
        cat.loseLife();
        cat.displayInfo();
        
        // Bird migration
        bird.migrate();
        
        System.out.println("\n🎉 Inheritance and Polymorphism Demo Complete!");
    }
}