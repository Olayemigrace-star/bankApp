package bankAccount;

public class Account {
    private int balance;
    private String name;
    private String pin;
    private String number;

    public Account(String firstName, String surName, String pin) {
        this.name = firstName + surName;
        this.pin = pin;

    }

    public int getBalance() {

        return balance;
    }

    public void deposit(int amount) {
        boolean isValidNumber = (amount > 0);
        if (isValidNumber) balance = balance + amount;
        else {
            throw new IllegalArgumentException();
        }
    }


    public void withdraw(int amount, String pin) {
        if ((pin.equals("8593")) && amount > 0 && balance >= amount) {
            balance = balance - amount;
        } else {
            throw new IllegalArgumentException();
        }
    }
}


