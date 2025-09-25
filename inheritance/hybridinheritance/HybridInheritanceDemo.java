package com.inheritance.hybridinheritance;

class Person {
    long phno;
    String name;

    public void PersonDetails() {
        System.out.println("Name: " + name + ", Phone: " + phno);
    }
}

class Employee extends Person {
    int empid;
    String position;
    float salary;

    public void EmployeeDetails() {
        System.out.println("EmpID: " + empid + ", Position: " + position + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String authority;

    public void managerauthority() {
        System.out.println("Authority: " + authority);
    }
}

class Client extends Person {
    String bond;
    String projects;

    public void clientdetails() {
        System.out.println("Bond: " + bond + ", Projects: " + projects);
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        // Creating Manager object
        Manager mgr = new Manager();
        mgr.name = "Alice";
        mgr.phno = 9876543210L;
        mgr.empid = 101;
        mgr.position = "Senior Manager";
        mgr.salary = 85000.50f;
        mgr.authority = "Project Approval";

        System.out.println("Manager Details:");
        mgr.PersonDetails();
        mgr.EmployeeDetails();
        mgr.managerauthority();

        System.out.println();

        // Creating Client object
        Client client = new Client();
        client.name = "Bob";
        client.phno = 9123456780L;
        client.bond = "2 years";
        client.projects = "Mobile App Development";

        System.out.println("Client Details:");
        client.PersonDetails();
        client.clientdetails();
    }
}
