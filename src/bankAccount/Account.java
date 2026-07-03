package bankAccount;

public class Account {
    private int balance;
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0) balance = balance + amount;
    }

    public boolean withdraw(int amount, int pin) {
        if (pin == 8593 && amount > 0 && balance >= amount)
        {
            balance = balance - amount;
            return true;
        }

        else{
            return false;
        }
        }
    }

