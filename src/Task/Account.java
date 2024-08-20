package Task;

import java.util.Scanner;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0.0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account myAccount = new Account();

        myAccount.displayBalance();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);
        myAccount.displayBalance();

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawAmount);
        myAccount.displayBalance();

        scanner.close();
}

}
