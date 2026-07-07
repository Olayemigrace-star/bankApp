package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void getCarNameTest(){
        Car car = new Car("honda", "camry", "orange");
        assertEquals("orange", car.getColor());
        //Parameterized constructor
    }
}
