package bankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    @Test
    public void registerANewCustomer_CustomerIs_1Test(){

        Bank bank = new Bank("Debo");
        bank.registerCustomer("Sunday", "Miracle", "1234");
        assertEquals(1, bank.getNumberOfCustomer());
    }
    @Test
    public void register_2_Customer_CustomerIs_2Test(){

        Bank bank = new Bank("Debo");
        bank.registerCustomer("Sunday", "Miracle", "1234");
        bank.registerCustomer("Elijah", "Sope", "1245");
        assertEquals(2, bank.getNumberOfCustomer());
    }


}
