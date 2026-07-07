package bankAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public Bank(String name) {
        this.name =name;
    }
    public Account registerCustomer(String firstName, String surname, String pin) {
        Account account = new Account(firstName, surname, pin);
        accounts.add(account);
        return account;
    }

    public int getNumberOfCustomer() {
        return accounts.size();
    }

}
