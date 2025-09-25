package com.ConditionalStatements;

import java.util.Scanner;

public class SwitchCases {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;  // Initial balance
        int choice;

        do {
            System.out.println("\n====== Welcome to Simple Bank ======");
            System.out.println("1: Cash Deposit");
            System.out.println("2: Cash Withdrawal");
            System.out.println("3: Check Balance");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Cash Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;

                case 2: // Cash Withdrawal
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Invalid amount or insufficient balance.");
                    }
                    break;

                case 3: // Check Balance
                    System.out.println("Your current balance is: ₹" + balance);
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using Simple Bank. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select between 1-4.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
