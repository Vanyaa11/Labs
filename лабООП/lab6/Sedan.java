package Lab06;

import java.util.Scanner;
class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    public void brake() {
        System.out.println("Седан гальмує.");
    }
}

