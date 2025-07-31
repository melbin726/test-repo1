package com.example.basic;

/**
 * Basic class demonstrating fundamental OOP concepts
 */
public class Person {
    // Private attributes (encapsulation)
    private String name;
    private int age;
    private String email;
    private String profession;
    
    // Constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.profession = "Student"; // Default value
    }
    
    // Overloaded constructor
    public Person(String name, int age, String email, String profession) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.profession = profession;
    }
    
    // Methods (behaviors)
    public void introduce() {
        System.out.println("Hi! I'm " + name + ", " + age + " years old.");
        System.out.println("I work as a " + profession + ".");
        System.out.println("You can reach me at: " + email);
    }
    
    public void celebrateBirthday() {
        age++;
        System.out.println("🎉 Happy Birthday " + name + "! Now " + age + " years old!");
    }
    
    public boolean canVote() {
        return age >= 18;
    }
    
    public String getAgeGroup() {
        if (age < 13) return "Child";
        if (age < 20) return "Teenager";
        if (age < 60) return "Adult";
        return "Senior";
    }
    
    // Getters (public access to private data)
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getProfession() {
        return profession;
    }
    
    // Setters (controlled modification of private data)
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }
    
    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
    
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format!");
        }
    }
    
    public void setProfession(String profession) {
        this.profession = profession;
    }
    
    // toString method for easy printing
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}