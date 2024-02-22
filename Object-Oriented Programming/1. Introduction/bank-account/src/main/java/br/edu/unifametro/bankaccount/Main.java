package br.edu.unifametro.bankaccount;

/*
 * Create a class representing a bank account.
 * The account stores the customer's name and CPF, as well as their balance. It must be possible to perform withdrawal,
 * deposit and display balance. Please note that withdrawals cannot be made from accounts without a positive balance
 * */

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("John Doe", 60851475143L, 500);

        // Initial balance
        System.out.println("INITIAL BALANCE");
        System.out.println(account.displayBalance());

        // DEPOSIT
        System.out.println("DEPOSIT");

        account.deposit(100);
        System.out.println(account.displayBalance());

        // Testing invalid input
        account.deposit(-50);

        // WITHDRAWAL
        System.out.println("\nWITHDRAWAL");

        account.withdrawal(200);
        System.out.println(account.displayBalance());

        // Testing invalid input
        account.withdrawal(600);

        // FINAL BALANCE
        System.out.println("\nFINAL BALANCE");
        System.out.println(account.displayBalance());
    }
}