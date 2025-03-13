package org.example;

public class TransactionSystem {
    private int balance;

    public TransactionSystem(int initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
        }
        else {
            throw new IllegalArgumentException("deposit harus > 0");
        }
    }

    public void withdraw(double amount){
        if (amount > balance){
            throw new IllegalArgumentException("balance gak cukup0");
        }
        balance -= amount;
    }

    public int getBalance(){
        return balance;
    }

    public void resetBalance(int amount){
        this.balance = amount;
    }

    public static void openConnection(){
        System.out.println("koneksi ke server.....");
    }

    public static void closeConnection(){
        System.out.println("close server.....");
    }
}
