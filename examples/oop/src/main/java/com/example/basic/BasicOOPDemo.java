package com.example.basic;

/**
 * Demo class to test Person and BankAccount classes
 * Shows how to create and use objects
 */
public class BasicOOPDemo {
    public static void main(String[] args) {
        System.out.println("=== Object-Oriented Programming Demo ===\n");
        
        // Creating Person objects
        System.out.println("1. Creating Person Objects:");
        System.out.println("-".repeat(30));
        
        Person person1 = new Person("Alice Johnson", 28, "alice@example.com", "Software Engineer");
        Person person2 = new Person("Bob Smith", 17, "bob@example.com");
        
        // Using object methods
        person1.introduce();
        System.out.println("Age Group: " + person1.getAgeGroup());
        System.out.println("Can Vote: " + person1.canVote());
        
        System.out.println();
        person2.introduce();
        System.out.println("Age Group: " + person2.getAgeGroup());
        System.out.println("Can Vote: " + person2.canVote());
        
        // Modifying object state
        System.out.println("\n2. Modifying Object State:");
        System.out.println("-".repeat(30));
        
        person2.celebrateBirthday();
        person2.celebrateBirthday(); // Now 19
        System.out.println("Can Vote Now: " + person2.canVote());
        
        // Demonstrating encapsulation with setters
        System.out.println("\n3. Testing Encapsulation (Data Validation):");
        System.out.println("-".repeat(45));
        
        person1.setAge(-5);  // Invalid age
        person1.setEmail("invalid-email");  // Invalid email
        person1.setName("");  // Invalid name
        
        // Valid changes
        person1.setAge(29);
        person1.setEmail("alice.johnson@company.com");
        person1.setProfession("Senior Software Engineer");
        
        System.out.println("\nUpdated Person: " + person1);
        
        // Banking System Demo
        System.out.println("\n4. Banking System Demo:");
        System.out.println("-".repeat(25));
        
        BankAccount account1 = new BankAccount("ACC001", "Alice Johnson", 5000.0, "Savings");
        BankAccount account2 = new BankAccount("ACC002", "Bob Smith", 1500.0, "Checking");
        
        System.out.println();
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        
        // Banking operations
        System.out.println("\n5. Banking Operations:");
        System.out.println("-".repeat(22));
        
        account1.deposit(1000);
        account1.withdraw(500);
        account1.checkBalance();
        
        System.out.println();
        account2.withdraw(2000);  // Should fail - insufficient funds
        account2.deposit(500);
        
        // Transfer money
        System.out.println("\n6. Money Transfer:");
        System.out.println("-".repeat(18));
        account1.transfer(account2, 1000);
        
        // Final balances
        System.out.println("\n7. Final Account Status:");
        System.out.println("-".repeat(25));
        System.out.println(account1.getAccountHolder() + " - Balance: $" + account1.getBalance() + 
                          " - Status: " + account1.getAccountStatus());
        System.out.println(account2.getAccountHolder() + " - Balance: $" + account2.getBalance() + 
                          " - Status: " + account2.getAccountStatus());
        
        // Demonstrating object arrays
        System.out.println("\n8. Working with Multiple Objects:");
        System.out.println("-".repeat(35));
        
        Person[] people = {
            new Person("Charlie Brown", 35, "charlie@example.com", "Teacher"),
            new Person("Diana Prince", 30, "diana@example.com", "Designer"),
            new Person("Eve Adams", 22, "eve@example.com", "Student")
        };
        
        System.out.println("People in our system:");
        for (Person person : people) {
            System.out.println("- " + person.getName() + " (" + person.getAgeGroup() + ")");
        }
        
        // Count adults
        int adultCount = 0;
        for (Person person : people) {
            if (person.canVote()) {
                adultCount++;
            }
        }
        System.out.println("\nAdults who can vote: " + adultCount + "/" + people.length);
    }
}