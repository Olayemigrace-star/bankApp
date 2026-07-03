package bankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account acct;
    @BeforeEach
    public void setup(){
        acct = new Account();
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
        //
        assertEquals(0, acct.getBalance());
        //when
        acct.deposit(200);
        acct.deposit(500);
        //Assert
        assertEquals(700, acct.getBalance());
    }

    @Test
    public void depositNegative50_balanceIs0Test(){
        //Given

        assertEquals(0, acct.getBalance());
        //when
        acct.deposit(-50);
        //Assert
        assertEquals(0, acct.getBalance());
    }
    @Test
    public void withdraw500WhenIsbalanceIs0Test(){
        //Given

        assertEquals(0, acct.getBalance());
        //when
       assertFalse(acct.withdraw(500, 8593));
        //Assert
        assertEquals(0, acct.getBalance());
    }
    @Test
    public void withdraw500WhenIsbalanceIs1000AndPinIsTrueTest(){
        //Given
        acct.deposit(1000);
        //Assert
        assertTrue(acct.withdraw(500, 8593));
    }




}
