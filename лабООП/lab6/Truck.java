package Lab06;

import java.util.Scanner;
class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    public void brake() {
        System.out.println("Грузовик гальмує.");
    }
}