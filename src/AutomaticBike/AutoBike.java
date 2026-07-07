package AutomaticBike;

public class AutoBike {
    private boolean isOn;
    private int gear;
    private int actualSpeed;
    //private int speed;
    //private int actualGear;
    int currentSpeed;
    public boolean bikeStatus() {

        return isOn;
    }

    public void bikeIsOff() {

        isOn = false;
    }

    public void bikeIsOn() {
        isOn = true;
    }

    public int speed() {

        return actualSpeed;
   }


    public void accelerate() {
        if (currentSpeed >= 0 && currentSpeed <= 20) actualSpeed = currentSpeed + 1;
        else if (currentSpeed >= 21 && currentSpeed <= 30) actualSpeed= currentSpeed + 2;
        else if (currentSpeed >= 31 && currentSpeed <= 40) actualSpeed = currentSpeed + 3;
        else {
            actualSpeed = currentSpeed + 4;
        }
    }

    public void deccelerate() {
        if (currentSpeed >= 0 && currentSpeed <= 20) actualSpeed = currentSpeed - 1;
        else if (currentSpeed >= 21 && currentSpeed <= 30) actualSpeed = currentSpeed - 2;
        else if (currentSpeed >= 31 && currentSpeed <= 40) actualSpeed = currentSpeed - 3;
        else {
            actualSpeed = currentSpeed - 4;
        }
    }

    public void bikeGear() {
            if (currentSpeed >= 0 && currentSpeed <= 20) gear = 1;
            else if (currentSpeed >= 21 && currentSpeed <= 30) gear = 2;
            else if (currentSpeed >= 31 && currentSpeed <= 40) gear = 3;
            else {
                gear = 4;
            }
    }

    public int bikeRange() {
        return gear;
    }
}





