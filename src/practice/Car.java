package practice;

public class Car {
    private String name;
    private String model;
    private String color;

    public Car(String name, String model, String color){
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public void drive(){
        System.out.print("my " + name + " is moving");
    }

    public String getColor() {
        return color;
    }
}
