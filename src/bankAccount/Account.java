package bankAccount;

public class Account {
    private String name;
    private int balance;
    private String pin;
    private int number;

    public Account(String firstName, String surName, String pin, int number) {
        this.name = firstName + surName;
        this.pin = pin;
        this.number = number;
    }

    public boolean isValidPin(String pin){
        if (this.pin == pin) return true;
        return false;
    }

    public int getNumber(){
        return number;
    }

    public int getBalance(String pin) {
        if (!isValidPin(pin)) throw new IllegalArgumentException("invalid pin");
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
            if (!isValidPin(pin)) throw new IllegalArgumentException("invalid pin");
            if (amount > balance) throw new IllegalArgumentException("Insufficient fund");
            balance = balance - amount;
    }
}


