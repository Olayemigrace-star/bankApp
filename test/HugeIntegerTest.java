import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {
    private HugeInteger hugeInteger;
    @BeforeEach
    public void setup() {
        hugeInteger = new HugeInteger();
    }

    @Test
    public void testNotNullForTheHugeInteger() {
        assertNotNull(hugeInteger);
    }

    @Test
    public void testHugeIntegerIsValid() {
        String hugeIntegerString = "123456789212345678931234567894123456789";
        hugeInteger.parse(hugeIntegerString);
    }

    @Test
    public void testParseAndToStringSmallNumber() {
        hugeInteger.parse("48");
        assertEquals("48", hugeInteger.toString());
    }

    @Test
    public void testLargeNumber() {
        hugeInteger.parse("123456789012345678901234567890");
        assertEquals("123456789012345678901234567890", hugeInteger.toString());
    }


    @Test
    public void testIsZeroFalse() {
        hugeInteger.parse("5");
        assertFalse(hugeInteger.isZero());
    }

    @Test
    public void testIsEqualTo() {
        HugeInteger b = new HugeInteger();
        hugeInteger.parse("123");
        b.parse("123");
        assertTrue(hugeInteger.isEqualTo(b));
    }

    @Test
    public void testIsGreaterThan() {
        HugeInteger b = new HugeInteger();
        hugeInteger.parse("500");
        b.parse("499");
        assertTrue(hugeInteger.isGreaterThan(b));
        assertFalse(b.isGreaterThan(hugeInteger));
    }


}
