package AirCondition;



public class AirConditioner {
    private boolean isOn;
    private int temperature;
    private final int MAX_TEMP = 30;
    private final int MIN_TEMP = 16;

    public boolean getIsOn() {
        return isOn;
    }
    public void turnAcOn() {
        isOn = true;
    }

    public void turnAcOff() {
        isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        temperature = temperature + 1;
        if (temperature > MAX_TEMP) temperature = MAX_TEMP;



    }
    public void setTemperature(int value){
        temperature = value;
    }

    public void decreaseTemperature() {
        temperature = temperature - 1;
        if (temperature < MIN_TEMP) temperature = MIN_TEMP;
    }
}
