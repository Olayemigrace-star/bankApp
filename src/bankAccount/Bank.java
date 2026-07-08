package bankAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    //private int amount;
    private int balance;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private int acctNumber = 1001;

    public Bank(String name) {

        this.name = name;
    }

    public Account registerCustomer(String firstName, String surname, String pin) {
        Account account = new Account(firstName, surname, pin, acctNumber);
        accounts.add(account);
        acctNumber++;
        return account;
    }

    public Account findAccount(int number){
        for (int index = 0; index < accounts.size(); index++){
            if (accounts.get(index).getNumber() == number) return accounts.get(index);
        }
        return null;
    }

    public int getNumberOfCustomer() {

        return accounts.size();
    }
    public void deposit(int number, int amount){
        findAccount(number).deposit(amount);
    }

    public int checkBalance(int number, String pin){
        return findAccount(number).getBalance(pin);
    }
    public void withDraw(int amount, int number,String pin){
         findAccount(number).withdraw(amount, pin);
    }
    public void transfer(int amount, int senderAcctNumber,int receiverAcctNumber, String pin){
        Account sender = findAccount(senderAcctNumber);
        Account receiver = findAccount(receiverAcctNumber);
        sender.withdraw(amount, pin);
        receiver.deposit(amount);
    }
}
