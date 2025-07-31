package com.example.basic;

/**
 * BankAccount class demonstrating encapsulation
 * Shows how to protect data and provide controlled access
 */
public class BankAccount {
    // Private attributes - cannot be accessed directly from outside
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountType = accountType;
        
        System.out.println("✅ Account created successfully!");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Initial Balance: $" + initialBalance);
    }
    
    // Public methods to interact with private data
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("💰 Deposited: $" + amount);
            System.out.println("💳 New Balance: $" + balance);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("💸 Withdrawn: $" + amount);
                System.out.println("💳 Remaining Balance: $" + balance);
            } else {
                System.out.println("❌ Insufficient funds! Available: $" + balance);
            }
        } else {
            System.out.println("❌ Invalid withdrawal amount!");
        }
    }
    
    public void transfer(BankAccount targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("🔄 Transferred $" + amount + " to " + targetAccount.getAccountHolder());
        } else {
            System.out.println("❌ Transfer failed! Check amount and balance.");
        }
    }
    
    public void displayAccountInfo() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("         ACCOUNT INFORMATION");
        System.out.println("=".repeat(40));
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
        System.out.println("=".repeat(40));
    }
    
    public void checkBalance() {
        System.out.println("💳 Current Balance: $" + balance);
    }
    
    // Getters - controlled read access to private data
    public String getAccountNumber() {
        // In real banking, you might return only last 4 digits for security
        return "*****" + accountNumber.substring(accountNumber.length() - 4);
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    // Method to check if account has sufficient funds
    public boolean hasSufficientFunds(double amount) {
        return balance >= amount;
    }
    
    // Method to get account status based on balance
    public String getAccountStatus() {
        if (balance >= 10000) {
            return "Premium";
        } else if (balance >= 1000) {
            return "Standard";
        } else {
            return "Basic";
        }
    }
}