package AirCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
        @Test
        public void turnACOnWhenItIsTurnOff(){
            //Given
            AirConditioner ac = new AirConditioner();
           ac.getIsOn();
            //Action
            ac.turnAcOn();
            //assert
            assertTrue(ac.getIsOn());
        }
    @Test
    public void turnACOffWhenItIsOn() {
        //Given
        AirConditioner ac = new AirConditioner();
        ac.turnAcOn();
        //Action
        ac.turnAcOff();
        //assert
        assertFalse(ac.getIsOn());
    }
    @Test
    public void increaseTemperatureWhenTemperatureIs_20To_24() {
        //Given
        AirConditioner ac = new AirConditioner();
        ac.turnAcOn();
        //Action
       ac.setTemperature(20);
       ac.increaseTemperature();
        assertEquals(21, ac.getTemperature());
    }
    @Test
    public void decreaseTemperatureWhenTemperatureIs_30To_24() {
        //Given
        AirConditioner ac = new AirConditioner();
        ac.turnAcOn();
        //Action
        ac.setTemperature(30);
        ac.decreaseTemperature();
        assertEquals(29, ac.getTemperature());
    }
    @Test
    public void WhenTemperatureIsIncreasedBeyond_30StillRemains_30() {
        //Given
        AirConditioner ac = new AirConditioner();
        ac.turnAcOn();
        //Action
        ac.setTemperature(30);
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
    }
    @Test
    public void WhenTemperatureIsDecreasedBelow_16StillRemains_16() {
        //Given
        AirConditioner ac = new AirConditioner();
        ac.turnAcOn();
        //Action
        ac.setTemperature(16);
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
    }

}

