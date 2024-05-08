
package lab.pkg7;

import java.util.Calendar;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of total account you want to create: ");
        
        int n=scanner.nextInt();

        System.out.println("Press (1) for creating a Checking Account");
        System.out.println("Press (2) for creating a Savings Account");

        Account[] accounts = new Account[4];

        for (int i = 0; i < n; i++) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    accounts[i] = createCheckingAccount(scanner);
                    break;
                case 2:
                    accounts[i] = createSavingsAccount(scanner);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        for (Account account : accounts) {
            if (account instanceof CheckingAccount) {
                CheckingAccount checkingAccount = (CheckingAccount) account;
                System.out.println("This is a Checking Account");
                System.out.println("Account ID: " + checkingAccount.getId());
                System.out.println("Date Created: " + checkingAccount.getDateCreated().getTime());
                System.out.println("Current Balance: " + checkingAccount.getBalance());
                System.out.println("Annual Interest Rate: " + checkingAccount.getAnnualInterestRate());
                System.out.println("Monthly Interest Amount: " + checkingAccount.getMonthlyInterestAmount());
                System.out.println("Overdraft Limit: " + checkingAccount.getOverdraftLimit());
            } 
            
            else if (account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                System.out.println("This is a Savings Account");
                System.out.println("Account ID: " + savingsAccount.getId());
                System.out.println("Date Created: " + savingsAccount.getDateCreated().getTime());
                System.out.println("Current Balance: " + savingsAccount.getBalance());
                System.out.println("Annual Interest Rate: " + savingsAccount.getAnnualInterestRate());
                System.out.println("Monthly Interest Amount: " + savingsAccount.getMonthlyInterestAmount());
                System.out.println("Credit Card Number: " + savingsAccount.getCreditCardNumber());
                System.out.println("Card Expiry Date: " + savingsAccount.getExpiryDate().getTime());
                System.out.println("Credit Balance: " + savingsAccount.getCreditBalance());
            }
            System.out.println();
        }
    }

    public static CheckingAccount createCheckingAccount(Scanner scanner) {
        System.out.println("Creating a Checking Account");
        System.out.print("Enter account ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter overdraft limit: ");
        double overdraftLimit = scanner.nextDouble();

        return new CheckingAccount(id, balance, annualInterestRate, overdraftLimit);
    }

    public static SavingsAccount createSavingsAccount(Scanner scanner) {
        System.out.println("Creating a Savings Account");
        System.out.print("Enter account ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        Calendar expiryDate = Calendar.getInstance();
        expiryDate.add(Calendar.YEAR, 5); // Setting expiry date 5 years from now

        System.out.print("Enter credit card number: ");
        long creditCardNumber = scanner.nextLong();
        
        System.out.println();

        return new SavingsAccount(id, balance, annualInterestRate, creditCardNumber, expiryDate);
    }
    
}
