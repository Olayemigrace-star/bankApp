import java.util.Scanner;

import practice.Car;

public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);
            // THIS IS FOR GEO LOCATION
//        GeoPoliticalZones zone = new GeoPoliticalZones();
//        System.out.print("Enter the state name to get the zone: ");
//        String location = input.nextLine();
//        System.out.println(zone.getStateName(location));

            // THIS IS FOR THE CAR CONSTRUCTOR
        Car car = new Car("toyota", "camry", "blue");
        car.drive();
        System.out.println();

        System.out.println(car.getColor());

    }
}
