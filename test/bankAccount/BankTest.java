package bankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {

    @Test
    public void registerANewCustomer_CustomerIs_1Test(){
        Bank bank = new Bank("Debo");
        Account account1 = bank.registerCustomer("Sunday", "Miracle", "1234");
        Account foundAccount = bank.findAccount(1001);
        assertEquals(account1, foundAccount);
    }

    @Test
    public void registerTheSecondCustomerTest(){

        Bank bank = new Bank("Debo");
        Account account1 = bank.registerCustomer("Sunday", "Miracle", "1234");
        Account account2 = bank.registerCustomer("Elijah", "Sope", "1245");
        Account foundAccount = bank.findAccount(1002);
        assertEquals(account2, foundAccount);
    }
    @Test
    public void toAccessTheNumberOfRegisteredCustomerTest(){

        Bank bank = new Bank("Debo");
        Account account1 = bank.registerCustomer("Sunday", "Miracle", "1234");
        Account Account2 = bank.registerCustomer("Elijah", "Sope", "1245");
        assertEquals(2, bank.getNumberOfCustomer());
    }

    @Test
    public void customerDeposits5000_CustomerHas_5000Test(){
        Bank bank = new Bank("Debo");
        Account account1 = bank.registerCustomer("Sunday", "Miracle", "1234");
        Account foundAccount = bank.findAccount(1001);
        bank.deposit(1001, 5000);
        assertEquals(5000, bank.checkBalance(1001, "1234"));
    }
    @Test
    public void customerDeposits10000AndWithdraws1000CustomerHas_9000Test(){
        Bank bank = new Bank("Debo");
        Account account1 = bank.registerCustomer("Sunday", "Miracle", "1234");
        Account foundAccount = bank.findAccount(1001);
        bank.deposit(1001, 10000);
        bank.withDraw(1000, 1001, "1234");
        assertEquals(9000, bank.checkBalance(1001, "1234"));
    }
    @Test
    public void customerHas0NairaAndWithdraws1000_Test(){
        Bank bank = new Bank("Debo");
        Account account1 = bank.registerCustomer("Sunday", "Miracle", "1234");
        Account foundAccount = bank.findAccount(1001);
        bank.checkBalance(1001, "1234");
        assertThrows(IllegalArgumentException.class, () -> bank.withDraw(1000, 1001, "1234"), "Insufficient Funds");
    }

    @Test
    public void tranfersWorksToOtherAccountsTest(){
        Bank bank = new Bank("Debo");
        Account account1 = bank.registerCustomer("Sunday", "Miracle", "1234");
        Account foundAccount = bank.findAccount(1001);
        Account Account2 = bank.registerCustomer("Elijah", "Sope", "1245");
        Account foundAccount2 = bank.findAccount(1002);
        bank.deposit(1001, 10000);
        bank.deposit(1002, 2000);
        bank.withDraw(2000, 1001, "1234");
        assertEquals(8000, bank.checkBalance(1001, "1234"));
    }

}
