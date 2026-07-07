package bankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account acct;
    @BeforeEach
    public void setup(){
        acct = new Account("OlaAccount", "1345", "2");
    }

    @Test
    public void deposit200InEmptyAccount_balanceIs200Test(){
        //Given
        assertEquals(0, acct.getBalance());
        //when
        acct.deposit(200);
        //Assert
       assertEquals(200, acct.getBalance());
    }
    @Test
    public void deposit200_Deposit500InEmptyAccount_balanceIs700Test(){
        assertEquals(0, acct.getBalance());
        acct.deposit(200);
        acct.deposit(500);
        assertEquals(700, acct.getBalance());
    }

    @Test
    public void depositNegative50_ErrorIsThrownTest(){
        assertEquals(0, acct.getBalance());
        assertThrows(IllegalArgumentException.class, () -> acct.deposit(-50), "Invalid amount Entered" );
    }

    @Test
    public void withdraw500WhenIsbalanceIs0Test(){
        assertEquals(0, acct.getBalance());
        assertThrows( IllegalArgumentException.class, () -> acct.withdraw(500, "8593"), "Insufficient funds");
    }

    @Test
    public void withdraw500WhenIsbalanceIs1000AndPinIsTrueTest(){
        acct.deposit(1000);
        acct.withdraw(500, "8593");
        assertEquals(500, acct.getBalance());
    }
    @Test
    public void throwsErrorForInvalidPinTest(){
        acct.deposit(1000);
        assertThrows(IllegalArgumentException.class, () -> acct.withdraw(200, "987"), "Invalid Pin");
    }




}
