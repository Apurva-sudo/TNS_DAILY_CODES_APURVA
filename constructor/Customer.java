package com.constructor;

import java.util.Scanner;

public class Customer {

    // Private fields
    private int id;
    private String name;
    private int age;

    // Default Constructor
    public Customer() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display customer details
    public void displayCustomer() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using default constructor
        Customer c1 = new Customer();

        // Taking user input and setting values using setters
        System.out.println("\nEnter customer details:");
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        Customer c2 = new Customer(); // default constructor
        c2.setId(id);
        c2.setName(name);
        c2.setAge(age);

        System.out.println("\nCustomer details using setters:");
        c2.displayCustomer();

        // Using parameterized constructor
        Customer c3 = new Customer(102, "Ramkrushna", 22);
        System.out.println("\nCustomer details using parameterized constructor:");
        c3.displayCustomer();

        scanner.close();
    }
}
