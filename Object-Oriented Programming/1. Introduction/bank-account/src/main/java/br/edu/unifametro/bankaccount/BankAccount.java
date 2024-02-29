package br.edu.unifametro.bankaccount;

public class BankAccount {

    public String clientName;
    public long cpf;
    public double balance;

    public BankAccount(String clientName, long cpf, double balance) {
        this.clientName = clientName;
        this.cpf = cpf;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }else {
            System.out.print("Please enter a valid amount!");
        }
    }

    public void withdrawal(double amount) {
        if (amount > this.balance || amount < 0) {
            System.out.print("Amount above balance or invalid!");
        }else {
            this.balance -= amount;
        }
    }

    public String displayBalance() {
        return "Client: " + clientName + " | "  + "Balance: " + balance;
    }
}
